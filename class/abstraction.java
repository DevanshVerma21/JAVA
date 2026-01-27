abstract class Animal{
    Animal(){
        System.out.println("Animal is called");
    }

    abstract void walk();
    public void eats(){
        System.out.println("Animal Eats");
    }


}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken");
    }
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        h1.eats();

        Chicken c1 = new Chicken();
        c1.walk();
        c1.eats();

        
    }
    
}
