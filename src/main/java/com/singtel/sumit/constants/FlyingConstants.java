package com.singtel.sumit.constants;

public enum FlyingConstants {
	
	CAN_FLY("Can Fly"),
	
    CANNOT_FLY("Cannot Fly");

    private String value;

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    FlyingConstants(String value) {
        this.value = value;
    }
}
