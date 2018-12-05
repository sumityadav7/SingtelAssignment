package com.singtel.sumit.action.impl.sing;

import com.singtel.sumit.constants.SingingConstants;

public class CatSound extends CanSing {

    @Override
    public void sing() {
    	System.out.println(SingingConstants.CAT_SOUND.getValue());
    }
}
