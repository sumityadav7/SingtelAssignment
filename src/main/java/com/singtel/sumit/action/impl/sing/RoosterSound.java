package com.singtel.sumit.action.impl.sing;

import com.singtel.sumit.constants.SingingConstants;

public class RoosterSound extends CanSing {

    @Override
    public void sing() {
    	System.out.println(SingingConstants.ROOSTER_SOUND.getValue());
    }
}
