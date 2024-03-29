package week_5_polymorphism;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setLegs(2);
		dog.setType("dog");
		
		MovementService.makeItMove(dog);
		
		Fish fish = new Fish();
		MovementService.makeItMove(fish);
		
		System.out.println("-------------------------");
		
		ArrayList<Animal> animalsCollection = new ArrayList<Animal>();
		
		Bird bird = new Bird();
		Animal animal = new Animal();
		
		animalsCollection.add(dog);
		animalsCollection.add(fish);
		animalsCollection.add(bird);
		animalsCollection.add(animal);
		
		MovementService.makeItMove(animalsCollection);
		
		
	}

}
