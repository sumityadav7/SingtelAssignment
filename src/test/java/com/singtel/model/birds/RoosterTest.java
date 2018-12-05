package com.singtel.model.birds;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.singtel.sumit.model.birds.Rooster;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoosterTest {

    Rooster rooster;
    ByteArrayOutputStream outContent;

    @BeforeEach
    public void setUp() {
        this.rooster = new Rooster();
        this.outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void singingTest(){

        rooster.getSingable().sing();
        assertEquals( outContent.toString(), "Cock-a-doodle-doo" + "\r\n");
    }

}