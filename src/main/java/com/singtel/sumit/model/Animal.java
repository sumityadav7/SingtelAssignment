package com.singtel.sumit.model;

import com.singtel.sumit.action.Carnivore;
import com.singtel.sumit.action.Joke;
import com.singtel.sumit.action.Flyable;
import com.singtel.sumit.action.Singable;
import com.singtel.sumit.action.Swimable;
import com.singtel.sumit.action.Walkable;

public class Animal {
	
	protected Walkable walkable;
    protected Flyable flyable;
    protected Singable singable;
    protected Swimable swimable;
    protected Carnivore carnivore;
    protected Joke clown;

    public Walkable getWalkable() {
        return walkable;
    }

    public void setWalkable(Walkable walkable) {
        this.walkable = walkable;
    }

    public Flyable getFlyable() {
        return flyable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }
    
    public Singable getSingable() {
        return singable;
    }

    public void setSingable(Singable singable) {
        this.singable = singable;
    }
    
    public Swimable getSwimable() {
        return swimable;
    }

    public void setSwimable(Swimable swimable) {
        this.swimable = swimable;
    }
    
    public Carnivore getCarnivore() {
        return carnivore;
    }

    public void setCarnivore(Carnivore carnivore) {
        this.carnivore = carnivore;
    }
    
    public Joke getClown() {
        return clown;
    }

    public void setClown(Joke clown) {
        this.clown = clown;
    }

}
