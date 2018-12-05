package com.singtel.model.fishes.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.singtel.sumit.constants.SingingConstants;
import com.singtel.sumit.constants.SwimmingConstants;
import com.singtel.sumit.constants.WalkingConstants;
import com.singtel.sumit.features.Colour;
import com.singtel.sumit.features.Size;
import com.singtel.sumit.model.fishes.Clownfish;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClownfishTest {

    Clownfish clownfish;
    ByteArrayOutputStream outContent;

    @BeforeEach
    public void setUp() {
        this.clownfish = new Clownfish();
        this.outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void walkingTest(){

        clownfish.getWalkable().walk();
        assertEquals( outContent.toString(), WalkingConstants.CANNOT_WALK.getValue()+ "\r\n" );

    }

    @Test
    public void singingTest(){

        clownfish.getSingable().sing();
        assertEquals( outContent.toString(), SingingConstants.CANNOT_SING.getValue()+ "\r\n" );

    }

    @Test
    public void swimmingTest(){

        clownfish.getSwimable().swim();
        assertEquals( outContent.toString(), SwimmingConstants.CAN_SWIM.getValue()+ "\r\n" );

    }

    @Test
    public void sizeTest(){

        assertEquals( clownfish.getSize(), Size.SMALL );

    }

    @Test
    public void colourTest(){

        assertEquals( clownfish.getColour(), Colour.ORANGE );

    }

    @Test
    public void jokingTest(){

        clownfish.getClown().makeJokes();
        assertEquals( outContent.toString(), "Can make Jokes" + "\r\n");

    }

}