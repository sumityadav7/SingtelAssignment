package com.singtel.services.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.singtel.sumit.model.Bird;
import com.singtel.sumit.model.Fish;
import com.singtel.sumit.model.Animal;
import com.singtel.sumit.model.birds.Butterfly;
import com.singtel.sumit.model.birds.Chicken;
import com.singtel.sumit.model.birds.Duck;
import com.singtel.sumit.model.birds.Parrot;
import com.singtel.sumit.model.birds.Rooster;
import com.singtel.sumit.model.fishes.Clownfish;
import com.singtel.sumit.model.fishes.Dolphins;
import com.singtel.sumit.model.fishes.Shark;
import com.singtel.sumit.model.mammals.Cat;
import com.singtel.sumit.model.mammals.Dog;
import com.singtel.sumit.model.mammals.Frog;
import com.singtel.sumit.service.CountAnimals;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountAnimalsTest {

    CountAnimals countAnimals;
    Animal parent[] ;

    @BeforeEach
    public  void setUp(){
        this.countAnimals=new CountAnimals();
        parent = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphins(),
                new Frog(),
                new Dog(),
                new Butterfly(),
                new Cat()
        };
    }

    @Test
    public void testFlyCount(){

        int count = this.countAnimals.flyableCount( parent );

        assertEquals( 5,count );
    }

    @Test
    public void testWalkCount(){

        int count = this.countAnimals.walkableCount( parent );

        assertEquals( 9,count );
    }

    @Test
    public void testSingCount(){

        int count = this.countAnimals.singCount( parent );

        assertEquals( 8,count );
    }

    @Test
    public void testSwimCount(){

        int count = this.countAnimals.swimableCount( parent );

        assertEquals( 5,count );
    }

}