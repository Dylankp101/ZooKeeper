package com.zookeeper1;

public class Gorilla extends Mamal {
	private Integer energyLevel = 100;
	public Integer throwSomething(Integer num) {
		System.out.println("The gorilla has thrown poo "+ num +" times!");
			this.energyLevel -= ( num * 5);
			return energyLevel;
	}
	public Integer eatBananas(Integer num) {
		System.out.println("The gorilla ate " + num + " Bananas");
			this.energyLevel += (num * 10);
			return energyLevel;
	}
	public Integer climb(Integer num) {
		System.out.println("The Gorilla tried to climb the fence");
		this.energyLevel -= (num * 10);
		return energyLevel;
	}
}
