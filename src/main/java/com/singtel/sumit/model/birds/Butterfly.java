package com.singtel.sumit.model.birds;

import com.singtel.sumit.action.impl.sing.CannotSing;
import com.singtel.sumit.model.Bird;

public class Butterfly extends Bird {

    public Butterfly(){
        this.singable = new CannotSing();
    }
}
