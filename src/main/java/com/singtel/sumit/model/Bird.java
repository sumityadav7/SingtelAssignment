package com.singtel.sumit.model;


import com.singtel.sumit.action.impl.fly.CanFly;
import com.singtel.sumit.action.impl.sing.CanSing;
import com.singtel.sumit.action.impl.walk.CanWalk;
import com.singtel.sumit.model.Animal;

public class Bird extends Animal{

    public Bird(){
        this.walkable=new CanWalk();
        this.flyable =new CanFly();
        this.singable=new CanSing();
    }
}