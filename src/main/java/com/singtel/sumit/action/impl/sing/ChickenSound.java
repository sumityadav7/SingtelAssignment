package com.singtel.sumit.action.impl.sing;

import com.singtel.sumit.constants.SingingConstants;

public class ChickenSound extends CanSing {

    @Override
    public void sing() {
    	System.out.println(SingingConstants.CHICKEN_SOUND.getValue());
    }
}
