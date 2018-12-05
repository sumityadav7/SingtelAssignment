package com.singtel.sumit.model.mammals;

import com.singtel.sumit.action.impl.fly.CannotFly;
import com.singtel.sumit.action.impl.walk.Crawl;
import com.singtel.sumit.model.Mammal;

public class Caterpillar extends Mammal {

    public Caterpillar(){
        this.flyable = new CannotFly();
        this.walkable = new Crawl();
    }
}
