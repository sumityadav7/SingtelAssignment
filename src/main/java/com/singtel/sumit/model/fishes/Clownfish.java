package com.singtel.sumit.model.fishes;

import com.singtel.sumit.action.impl.joke.CanJoke;
import com.singtel.sumit.features.Colour;
import com.singtel.sumit.features.Size;
import com.singtel.sumit.model.Fish;

public class Clownfish extends Fish {

    public Clownfish(){
        this.size = Size.SMALL;
        this.colour = Colour.ORANGE;
        this.clown = new CanJoke();
    }
}
