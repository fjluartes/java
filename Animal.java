public class Animal {
    picture;
    food;
    hunger;
    boundaries;
    location;

    makeNoise() {}
    eat() {}
    sleep() {}
    roam() {}
}

// abstract: for compiler to prevent instantiation of this class
abstract class Canine extends Animal {
    public void roam() {}
}

public class Feline extends Animal {
    roam() {}
}

public class Hippo extends Animal {
    makeNoise() {}
    eat() {}
}

public class Wolf extends Canine {
    makeNoise() {}
    eat() {}
}

public class Dog extends Canine {
    makeNoise() {}
    eat() {}
}

public class Lion extends Feline {
    makeNoise() {}
    eat() {}
}

public class Tiger extends Feline {
    makeNoise() {}
    eat() {}
}

public class Cat extends Feline {
    makeNoise() {}
    eat() {}
}

// Method calls
Wolf w = new Wolf(); // new Wolf object
w.makeNoise(); // Wolf version
w.roam(); // Canine version
w.eat(); // Wolf version
w.sleep(); // Animal version

// polymorphism (array)
Animal[] animals = new Animal[5];
animals[0] = new Dog();
animals[1] = new Cat();
animals[2] = new Wolf();
animals[3] = new Hippo();
animals[4] = new Lion();

for (int i = 0; i < animals.length; i++) {
    animals[i].eat();
    animals[i].roam();
}

// polymorphism (arguments and return types)
class Vet {
    public void giveShot(Animal a) {
        // give shot at animal
        a.makeNoise();
    }
}

class PetOwner {
    public void start() {
        Vet v = new Vet();
        Dog d = new Dog();
        Hippo h = new Hippo();
        v.giveShot(d); // dog's makeNoise()
        v.giveShot(h); // hippo's makeNoise()
    }
}
