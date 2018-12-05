package com.singtel.sumit.action.impl.joke;

import com.singtel.sumit.action.Joke;

public class CannotJoke implements Joke {

    public void makeJokes() {
        System.out.println( "Cannot make jokes" );
    }
}
