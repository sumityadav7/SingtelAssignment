package com.singtel.sumit.model;

import com.singtel.sumit.action.impl.walk.CanWalk;

public class Mammal extends Animal {

    public Mammal(){
        this.walkable=new CanWalk();
    }
}