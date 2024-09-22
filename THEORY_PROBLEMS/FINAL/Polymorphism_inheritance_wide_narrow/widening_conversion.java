class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class widening_conversion {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal animal = myCat; // widening conversion
        animal.sound();
    }
}
