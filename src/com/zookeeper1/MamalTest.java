package com.zookeeper1;

public class MamalTest {
	public static void main(String[] args) {
		Mamal iDmamal = new Mamal();
		Gorilla iDgorilla = new Gorilla();
		Bat iDbat = new Bat();
		
//		Mamal Energy
		Integer gEnergy = iDmamal.displayGorillaEnergy();
		Integer bEnergy = iDmamal.displayBatEnergy();
		
//		Gorilla
		Integer gorillaEnergy = iDgorilla.throwSomething(3);
		Integer eatFood = iDgorilla.eatBananas(3);
		Integer climbingGorilla = iDgorilla.climb(1);
		
		System.out.println("Gorilla Overall Energy: " + gorillaEnergy + "/" + gEnergy);
		System.out.println("Gorilla Overall Energy: " + eatFood + "/" + gEnergy);
		System.out.println("Gorilla Overall Energy: " + climbingGorilla + "/" + gEnergy);

//		Bat
		Integer batFly = iDbat.fly(2);
		Integer batEat = iDbat.eatHumans(2);
		Integer batAttack = iDbat.attackTown(3);

		System.out.println("Bat Overall Energy: " + batFly + "/" + bEnergy);
		System.out.println("Bat Overall Energy: " + batEat + "/" + bEnergy);
		System.out.println("Bat Overall Energy: " + batAttack + "/" + bEnergy);

		
	}
}
