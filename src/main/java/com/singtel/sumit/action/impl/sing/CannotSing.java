package com.singtel.sumit.action.impl.sing;

import com.singtel.sumit.action.Singable;
import com.singtel.sumit.constants.SingingConstants;

public class CannotSing implements Singable {

	public void sing() {
        System.out.println(SingingConstants.CANNOT_SING.getValue());
    }
}
