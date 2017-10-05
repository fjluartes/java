// sample class Canine
abstract class Animal {
	public void roam() {}
	public void makeNoise() {}
}

abstract public class Canine extends Animal {
	public void roam() {}
}

class Dog extends Canine {
	public void makeNoise() {}
}

class MakeCanine {
	public void go() {
		Canine c;
		c = new Dog();
		// Canine cannot be instantiated
		c = new Canine();
		c.roam();
	}
}
