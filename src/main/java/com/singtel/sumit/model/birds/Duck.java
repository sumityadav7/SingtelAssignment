package com.singtel.sumit.model.birds;

import com.singtel.sumit.action.impl.sing.DuckSound;
import com.singtel.sumit.action.impl.swim.CanSwim;
import com.singtel.sumit.model.Bird;

public class Duck extends Bird {

    public Duck() {
        this.swimable = new CanSwim();
        this.singable = new DuckSound();
    }
}
