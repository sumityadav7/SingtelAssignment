package com.singtel.model.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.singtel.sumit.action.Singable;
import com.singtel.sumit.constants.SingingConstants;
import com.singtel.sumit.constants.SwimmingConstants;
import com.singtel.sumit.constants.WalkingConstants;
import com.singtel.sumit.model.Fish;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FishTest {

    Fish fish;
    ByteArrayOutputStream outContent;

    @BeforeEach
    public void setUp() {
        this.fish = new Fish();
        this.outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void walkingTest(){

        fish.getWalkable().walk();
        assertEquals( outContent.toString(), WalkingConstants.CANNOT_WALK.getValue() + "\r\n");

    }

    @Test
    public void singingTest(){

        fish.getSingable().sing();
        assertEquals( outContent.toString(), SingingConstants.CANNOT_SING.getValue() + "\r\n");

    }

    @Test
    public void swimmingTest(){

        fish.getSwimable().swim();
        assertEquals( outContent.toString(), SwimmingConstants.CAN_SWIM.getValue() + "\r\n");

    }

}