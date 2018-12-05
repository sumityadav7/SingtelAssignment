package com.singtel.sumit.model.birds;

import com.singtel.sumit.action.Singable;
import com.singtel.sumit.model.Bird;

public class Parrot extends Bird {
	
	public Parrot() {
		
	}

    public Parrot(Singable sound){
        this.singable = sound;
    }
}