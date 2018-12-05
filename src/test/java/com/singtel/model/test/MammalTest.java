package com.singtel.model.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.singtel.sumit.constants.WalkingConstants;
import com.singtel.sumit.model.Mammal;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MammalTest {

    Mammal mammal;
    ByteArrayOutputStream outContent;


    @BeforeEach
    public void setUp() {
        this.mammal = new Mammal();
        this.outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testWalk(){

        mammal.getWalkable().walk();
        assertEquals( outContent.toString(), WalkingConstants.CAN_WALK.getValue() + "\r\n" );
    }

}