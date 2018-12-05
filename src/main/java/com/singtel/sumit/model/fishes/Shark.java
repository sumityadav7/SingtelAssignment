package com.singtel.sumit.model.fishes;

import com.singtel.sumit.features.Colour;
import com.singtel.sumit.features.Size;
import com.singtel.sumit.action.impl.carnivore.CanEatOtherFish;
import com.singtel.sumit.model.Fish;

public class Shark extends Fish {

    public Shark(){
        this.size = Size.LARGE;
        this.colour = Colour.GREY;
        this.carnivore = new CanEatOtherFish();
    }
}
