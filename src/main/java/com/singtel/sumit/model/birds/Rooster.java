package com.singtel.sumit.model.birds;

import com.singtel.sumit.action.impl.sing.RoosterSound;
import com.singtel.sumit.model.Bird;

public class Rooster extends Bird {

    public Rooster() {
        this.singable = new RoosterSound();
    }
}
