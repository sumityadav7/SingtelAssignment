package com.singtel.sumit.action.impl.sing;

import com.singtel.sumit.constants.SingingConstants;

public class DogSound extends CanSing {

    @Override
    public void sing() {
        System.out.println(SingingConstants.DOG_SOUND.getValue());
    }
}
