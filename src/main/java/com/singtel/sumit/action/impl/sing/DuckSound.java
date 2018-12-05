package com.singtel.sumit.action.impl.sing;

import com.singtel.sumit.constants.SingingConstants;

public class DuckSound extends CanSing {

    @Override
    public void sing() {
        System.out.println(SingingConstants.DUCK_SOUND.getValue());
    }
}
