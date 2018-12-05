package com.singtel.sumit.model.birds;

import com.singtel.sumit.action.impl.fly.CannotFly;
import com.singtel.sumit.action.impl.sing.ChickenSound;
import com.singtel.sumit.model.Bird;

public class Chicken extends Bird {

    public Chicken() {

        this.flyable = new CannotFly();
        this.singable = new ChickenSound();
    }
}
