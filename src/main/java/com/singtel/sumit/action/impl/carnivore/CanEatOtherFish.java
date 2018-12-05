package com.singtel.sumit.action.impl.carnivore;

import com.singtel.sumit.action.Carnivore;

public class CanEatOtherFish implements Carnivore {

	@Override
	public void canEatOtherFish() {
		System.out.println( "Eating Other Fishes" );
		
	}
}
