package com.zookeeper1;

public class Bat extends Mamal {
private Integer energy = 300;
public Integer fly(Integer num) {
	System.out.println("EEEEEEEEEEEEE");
	this.energy -= (num * 50);
	return energy;
}
public Integer eatHumans(Integer num) {
	System.out.println("The bat ate " + num + " humans!" );
	this.energy += (num * 25);
	return energy;
}
public Integer attackTown(Integer num) {
	System.out.println("The town was left on fire by the BAT! " + num + " Town(s)");
	this.energy -= (num * 100);
	return energy;
}
}
