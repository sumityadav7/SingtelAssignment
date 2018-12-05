package com.singtel.model.birds;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.singtel.sumit.constants.FlyingConstants;
import com.singtel.sumit.model.birds.Chicken;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChickenTest {

    Chicken chicken;
    ByteArrayOutputStream outContent;

    @BeforeEach
    public void setUp() {
        this.chicken = new Chicken();
        this.outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void flyingTest(){

        chicken.getFlyable().fly();
        assertEquals( outContent.toString(), FlyingConstants.CANNOT_FLY.getValue() + "\r\n");
    }

    @Test
    public void singingTest(){

        chicken.getSingable().sing();
        assertEquals( outContent.toString(), "Cluck, cluck" + "\r\n");
    }

}