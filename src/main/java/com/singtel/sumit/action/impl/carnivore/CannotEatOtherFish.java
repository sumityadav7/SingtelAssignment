package com.singtel.sumit.action.impl.carnivore;

import com.singtel.sumit.action.Carnivore;

public class CannotEatOtherFish implements Carnivore {

	@Override
	public void canEatOtherFish() {
		System.out.println( "Cannot eat Other Fishes" );		
	}
}
