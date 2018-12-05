package com.singtel.sumit.constants;

public enum SingingConstants {
	
	CAN_SING("Can Sing"),
	
    DUCK_SOUND("Quack quack"),
    
    CHICKEN_SOUND("Cluck, cluck"),
    
    ROOSTER_SOUND("Cock-a-doodle-doo"),
    
    DOG_SOUND("Woof, woof"),
    
    CAT_SOUND("Meow"),
    
    CANNOT_SING("Cannot Sing");

    private String value;

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    SingingConstants(String value) {
        this.value = value;
    }
}
