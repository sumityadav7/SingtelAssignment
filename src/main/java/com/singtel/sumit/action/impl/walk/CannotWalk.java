package com.singtel.sumit.action.impl.walk;

import com.singtel.sumit.action.Walkable;
import com.singtel.sumit.constants.WalkingConstants;

public class CannotWalk implements Walkable {

    public void walk() {
        System.out.println(WalkingConstants.CANNOT_WALK.getValue());
    }
}
