package com.singtel.sumit.service;

import java.util.Arrays;

import com.singtel.sumit.action.impl.fly.CanFly;
import com.singtel.sumit.action.impl.sing.CanSing;
import com.singtel.sumit.action.impl.swim.CanSwim;
import com.singtel.sumit.action.impl.walk.CanWalk;
import com.singtel.sumit.model.Animal;


public class CountAnimals {
	
	public int flyableCount( Animal animals[]){

        return Arrays.stream( animals ).filter( animal -> animal.getFlyable() instanceof CanFly ).toArray().length;

    }

    public int walkableCount( Animal animals[]){

        return Arrays.stream( animals ).filter( animal -> animal.getWalkable() instanceof CanWalk ).toArray().length;

    }

    public int singCount( Animal animals[]){

        return Arrays.stream( animals ).filter( animal -> animal.getSingable() instanceof CanSing ).toArray().length;

    }

    public int swimableCount( Animal animals[]){

        return Arrays.stream( animals ).filter( animal -> animal.getSwimable() instanceof CanSwim ).toArray().length;

    }

}
