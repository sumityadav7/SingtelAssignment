package com.singtel.model.birds;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.singtel.sumit.action.impl.sing.CatSound;
import com.singtel.sumit.action.impl.sing.DogSound;
import com.singtel.sumit.action.impl.sing.DuckSound;
import com.singtel.sumit.action.impl.sing.RoosterSound;
import com.singtel.sumit.model.birds.Parrot;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParrotTest {


    ByteArrayOutputStream outContent;

    @BeforeEach
    public void setUp() {
        this.outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void parrotNearDogTest(){

        Parrot parrot = new Parrot(new DogSound());
        parrot.getSingable().sing();
        assertEquals( outContent.toString(), "Woof, woof"+ "\r\n" );
    }

    @Test
    public void parrotNearCatTest(){

        Parrot parrot = new Parrot( new CatSound() );
        parrot.getSingable().sing();
        assertEquals( outContent.toString(), "Meow" + "\r\n");
    }

    @Test
    public void parrotNearRoosterTest(){

        Parrot parrot = new Parrot( new RoosterSound() );
        parrot.getSingable().sing();
        assertEquals( outContent.toString(), "Cock-a-doodle-doo" + "\r\n");
    }

    @Test
    public void parrotNearDuckTest(){

        Parrot parrot = new Parrot( new DuckSound() );
        parrot.getSingable().sing();
        assertEquals( outContent.toString(), "Quack quack" + "\r\n");
    }

}