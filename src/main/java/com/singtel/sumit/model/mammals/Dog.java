package com.singtel.sumit.model.mammals;

import com.singtel.sumit.action.impl.sing.DogSound;
import com.singtel.sumit.model.Mammal;

public class Dog extends Mammal {

    public Dog(){
        this.singable = new DogSound();
    }
}
