package com.singtel.sumit.model.mammals;

import com.singtel.sumit.action.impl.sing.CatSound;
import com.singtel.sumit.model.Mammal;

public class Cat extends Mammal {

    public Cat(){
        this.singable = new CatSound();
    }
}
