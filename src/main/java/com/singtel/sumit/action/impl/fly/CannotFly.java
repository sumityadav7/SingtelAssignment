package com.singtel.sumit.action.impl.fly;

import com.singtel.sumit.action.Flyable;
import com.singtel.sumit.constants.FlyingConstants;

public class CannotFly implements Flyable {

	public void fly() {
		System.out.println(FlyingConstants.CANNOT_FLY.getValue());
	}
}
