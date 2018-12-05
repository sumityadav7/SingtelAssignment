package com.singtel.sumit.action.impl.walk;

import com.singtel.sumit.action.Walkable;
import com.singtel.sumit.constants.WalkingConstants;

public class CanWalk implements Walkable {

    public void walk() {
        System.out.println(WalkingConstants.CAN_WALK.getValue());
    }
}
