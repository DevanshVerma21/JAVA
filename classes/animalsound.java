class Animal {
    void sound(){
        System.out.println("Animal makes sound");
    }

}

class Dog extends Animal {
    void sound(){
        System.out.println("Barks");

    }

}

class Cat extends Animal {
    void sound(){
        System.out.println("Meows");
    }

}



public class animalsound {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a2.sound();

    }
    
}
