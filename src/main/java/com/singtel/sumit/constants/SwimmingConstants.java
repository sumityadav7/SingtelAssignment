package com.singtel.sumit.constants;

public enum SwimmingConstants {
	
	CAN_SWIM("Can Swim"),
	
    CANNOT_SWIM("Cannot Swim");

    private String value;

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    SwimmingConstants(String value) {
        this.value = value;
    }
}
