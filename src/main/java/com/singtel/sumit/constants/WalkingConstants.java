package com.singtel.sumit.constants;

public enum WalkingConstants {
	
	CAN_WALK("Can Walk"),
	
    CANNOT_WALK("Cannot Walk"),
    
    CAN_CRAWL("Can Crawl");

    private String value;

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    WalkingConstants(String value) {
        this.value = value;
    }
}
