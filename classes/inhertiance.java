import java.util.*;
import classes.bank.Bank;

class Shape {
    Shape(){
        System.out.println("Every thing is a shape");
    }

    public void area() {
        System.out.println("Display Area");
    }
}

class Triangle extends Shape {

    Triangle(){
        System.out.println("Triangle");
    }

    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

class EquilateralTriangle extends Triangle {

    EquilateralTriangle(){
        System.out.println("Equilateral Triangle");
    }

    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

class Circle extends Shape {
    Circle(){
        System.out.println("Circle");
    }
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

public class inhertiance {
    public static void main(String[] args) {
        // Shape s1 = new Shape();

        // Triangle t1 = new Triangle();
        // t1.area(5, 4);

        // EquilateralTriangle t2 = new EquilateralTriangle();
        // t2.area(6,7);

        // Circle c1  = new Circle();
        // c1.area(7);

        Bank.Account ac1 = new Bank.Account();
        ac1.name = "dev";

    }

}
