package com.singtel.sumit.model.mammals;

import com.singtel.sumit.action.impl.sing.CanSing;
import com.singtel.sumit.model.Mammal;

public class Frog extends Mammal {

    public Frog(){
        this.singable = new CanSing();
    }
}
