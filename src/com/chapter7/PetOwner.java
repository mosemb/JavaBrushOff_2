package com.chapter7;

public class PetOwner {
	
	public void start() {
		
		Vet ownerVet = new Vet();
		Dog dog = new Dog();
		Wolf wolf = new Wolf();
		
		ownerVet.giveShot(dog); // Polymorhphism
		ownerVet.giveShot(wolf); // Polymorhphism
	}

}
