package com.singtel.sumit.action.impl.swim;

import com.singtel.sumit.action.Swimable;
import com.singtel.sumit.constants.SwimmingConstants;

public class CannotSwim implements Swimable  {
	public void swim() {
        System.out.println(SwimmingConstants.CANNOT_SWIM.getValue());
    }
}
