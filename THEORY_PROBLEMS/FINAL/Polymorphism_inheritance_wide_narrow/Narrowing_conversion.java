class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }

    void fetch() {
        System.out.println("Fetching the information");
    }
}

public class Narrowing_conversion {
    public static void main(String[] args) {
        Animal myAnimal = new Cat(); // widening cat -> animal
        myAnimal.sound();
        // narrowing conversion casting animal to cat
        Cat myCat = (Cat) myAnimal;
        myCat.sound();
        myCat.fetch();
    }
}
