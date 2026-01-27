class Pen {
    String color;
    String brand;
    String type;

    Pen(String color, String brand, String type) {
        this.color = color;
        this.brand = brand;
        this.type = type;
    }

    void display() {
        System.out.println("Colour: " + color);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
    }
}

class Student{
    String name;
    int age;

    Student(){
        System.out.println("Hello");
    }
    Student (Student s2){
        System.out.println("Copy Constructor");
        this.name = s2.name;
        this.age = s2.age;
    }

    void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    void printinfo(String name){
        System.out.println("Name:"+name);
    }

    
    void printinfo(int age){
        System.out.println("Age:"+age);
    }
}

public class oops {
    public static void main(String[] args) {
        Pen pen1 = new Pen("Red", "Trimax", "Gel");
        Pen pen2 = new Pen("Black", "Trimax", "Ball");

        // pen1.display();
        // pen2.display();


        Student s1 = new Student();
        s1.name = "Dev";
        s1.age = 20;

        s1.printinfo();
        s1.printinfo(21);
        s1.printinfo("Devansh");

        Student s2 = new Student(s1);
        // s2.name = "vansh";
        // s2.age = 20;

        s2.printinfo();
    }
}
