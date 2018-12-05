package com.singtel.model.birds;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.singtel.sumit.constants.FlyingConstants;
import com.singtel.sumit.constants.SingingConstants;
import com.singtel.sumit.model.birds.Butterfly;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ButterflyTest {

    Butterfly butterfly;
    ByteArrayOutputStream outContent;

    @BeforeEach
    public void setUp() {
        this.butterfly = new Butterfly();
        this.outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void flyingTest(){

        butterfly.getFlyable().fly();
        assertEquals( outContent.toString(), FlyingConstants.CAN_FLY.getValue() + "\r\n");
    }

    @Test
    public void singingTest(){

        butterfly.getSingable().sing();
        assertEquals( outContent.toString(), SingingConstants.CANNOT_SING.getValue() + "\r\n" );
    }

}