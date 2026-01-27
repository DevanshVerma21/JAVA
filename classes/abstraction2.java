interface Animal{
    public void walk();
}

interface Herbivores{
    public void eat();
}

class Horse implements Animal,Herbivores {
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
    public void eat(){
        System.out.println("Grass");
    }
}




public class abstraction2 {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
        
    }
    
}
