package com.singtel.model.fishes.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.singtel.sumit.constants.SingingConstants;
import com.singtel.sumit.constants.SwimmingConstants;
import com.singtel.sumit.constants.WalkingConstants;
import com.singtel.sumit.features.Colour;
import com.singtel.sumit.features.Size;
import com.singtel.sumit.model.fishes.Shark;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SharkTest {

    Shark shark;
    ByteArrayOutputStream outContent;

    @BeforeEach
    public void setUp() {
        this.shark = new Shark();
        this.outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void walkingTest(){

        shark.getWalkable().walk();
        assertEquals( outContent.toString(), WalkingConstants.CANNOT_WALK.getValue()+ "\r\n" );

    }

    @Test
    public void singingTest(){

        shark.getSingable().sing();
        assertEquals( outContent.toString(), SingingConstants.CANNOT_SING.getValue()+ "\r\n" );

    }

    @Test
    public void swimmingTest(){

        shark.getSwimable().swim();
        assertEquals( outContent.toString(), SwimmingConstants.CAN_SWIM.getValue() + "\r\n");

    }

    @Test
    public void sizeTest(){

        assertEquals( shark.getSize(), Size.LARGE );

    }

    @Test
    public void colourTest(){

        assertEquals( shark.getColour(), Colour.GREY );

    }

    @Test
    public void CarnivoreTest(){

        shark.getCarnivore().canEatOtherFish();
        assertEquals( outContent.toString(), "Eating Other Fishes"+ "\r\n" );

    }

}