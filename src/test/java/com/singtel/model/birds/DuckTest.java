package com.singtel.model.birds;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.singtel.sumit.constants.SwimmingConstants;
import com.singtel.sumit.model.birds.Duck;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DuckTest {

    Duck duck;
    ByteArrayOutputStream outContent;

    @BeforeEach
    public void setUp() {
        this.duck = new Duck();
        this.outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void swimmingTest(){

        duck.getSwimable().swim();
        assertEquals( outContent.toString(), SwimmingConstants.CAN_SWIM.getValue() + "\r\n");
    }

    @Test
    public void singingTest(){

        duck.getSingable().sing();
        assertEquals( outContent.toString(), "Quack quack" + "\r\n");
    }

}