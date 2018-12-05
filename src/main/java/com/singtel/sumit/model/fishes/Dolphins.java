package com.singtel.sumit.model.fishes;

import com.singtel.sumit.action.Carnivore;
import com.singtel.sumit.action.Joke;
import com.singtel.sumit.action.Flyable;
import com.singtel.sumit.action.Singable;
import com.singtel.sumit.action.Swimable;
import com.singtel.sumit.action.Walkable;
import com.singtel.sumit.model.Fish;
import com.singtel.sumit.model.Animal;

public class Dolphins extends Animal {

    public Fish getFish() {
        return fish;
    }

    public void setFish(Fish fish) {
        this.fish = fish;
    }

    Fish fish;

    public Dolphins(){
        this.fish = new Fish();
    }

    @Override
    public Singable getSingable() {
        return fish.getSingable();
    }

    @Override
    public Flyable getFlyable() {
        return fish.getFlyable();
    }

    @Override
    public Carnivore getCarnivore() {
        return fish.getCarnivore();
    }

    @Override
    public Joke getClown() {
        return fish.getClown();
    }

    @Override
    public Swimable getSwimable() {
        return fish.getSwimable();
    }

    @Override
    public Walkable getWalkable() {
        return this.fish.getWalkable();
    }

    @Override
    public void setCarnivore(Carnivore carnivore) {
        this.fish.setCarnivore( carnivore );
    }

    @Override
    public void setClown(Joke clown) {
        this.fish.setClown( clown );
    }

    @Override
    public void setFlyable(Flyable flyable) {
        this.fish.setFlyable( flyable );
    }

    @Override
    public void setSingable(Singable singable) {
        this.fish.setSingable( singable );
    }

    @Override
    public void setSwimable(Swimable swimable) {
        this.fish.setSwimable( swimable );
    }

    @Override
    public void setWalkable(Walkable walkable) {
        this.fish.setWalkable( walkable );
    }
}
