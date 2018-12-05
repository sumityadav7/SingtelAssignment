package com.singtel.sumit.model;

import com.singtel.sumit.features.Colour;
import com.singtel.sumit.features.Size;
import com.singtel.sumit.action.impl.sing.CannotSing;
import com.singtel.sumit.action.impl.swim.CanSwim;
import com.singtel.sumit.action.impl.walk.CannotWalk;

public class Fish  extends Animal{

	protected Size size;
    protected Colour colour;


    public Fish(){
        this.walkable = new CannotWalk();
        this.singable = new CannotSing();
        this.swimable = new CanSwim();
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }
}