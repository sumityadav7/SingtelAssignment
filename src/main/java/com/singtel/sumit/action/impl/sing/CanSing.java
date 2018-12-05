package com.singtel.sumit.action.impl.sing;

import com.singtel.sumit.action.Singable;
import com.singtel.sumit.constants.SingingConstants;

public class CanSing implements Singable {

	public void sing() {
        System.out.println(SingingConstants.CAN_SING.getValue());
    }
}
