package com.singtel.model.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.singtel.sumit.constants.FlyingConstants;
import com.singtel.sumit.constants.SingingConstants;
import com.singtel.sumit.constants.WalkingConstants;
import com.singtel.sumit.model.Bird;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BirdTest {

    Bird bird;
    ByteArrayOutputStream outContent;

    @BeforeEach
    public void setUp() {
        this.bird = new Bird();
        this.outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void walkingTest(){

        bird.getWalkable().walk();
        assertEquals( outContent.toString(), WalkingConstants.CAN_WALK.getValue() + "\r\n");

    }

    @Test
    public void flyingTest(){

        bird.getFlyable().fly();
        assertEquals( outContent.toString(), FlyingConstants.CAN_FLY.getValue() + "\r\n" );

    }

    @Test
    public void singingTest(){

        bird.getSingable().sing();
        assertEquals( outContent.toString(), SingingConstants.CAN_SING.getValue() + "\r\n" );

    }
}