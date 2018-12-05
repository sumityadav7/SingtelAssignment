package com.singtel.sumit.action.impl.walk;

import com.singtel.sumit.constants.WalkingConstants;

public class Crawl extends CanWalk {

    public void walk() {
        System.out.println(WalkingConstants.CAN_CRAWL.getValue());
    }
}
