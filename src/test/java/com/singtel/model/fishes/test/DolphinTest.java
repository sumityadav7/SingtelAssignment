package com.singtel.model.fishes.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.singtel.sumit.constants.SingingConstants;
import com.singtel.sumit.constants.SwimmingConstants;
import com.singtel.sumit.constants.WalkingConstants;
import com.singtel.sumit.model.fishes.Dolphins;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DolphinTest {

    Dolphins dolphins;
    ByteArrayOutputStream outContent;

    @BeforeEach
    public void setUp() {
        this.dolphins = new Dolphins();
        this.outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void walkingTest(){

        dolphins.getFish().getWalkable().walk();
        assertEquals( outContent.toString(), WalkingConstants.CANNOT_WALK.getValue()+ "\r\n" );

    }

    @Test
    public void singingTest(){

        dolphins.getFish().getSingable().sing();
        assertEquals( outContent.toString(), SingingConstants.CANNOT_SING.getValue()+ "\r\n");

    }

    @Test
    public void swimmingTest(){

        dolphins.getFish().getSwimable().swim();
        assertEquals( outContent.toString(), SwimmingConstants.CAN_SWIM.getValue()+ "\r\n");

    }

}