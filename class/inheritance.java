import java.util.*;
import bank.Bank;

class Shape {

    public void area() {
        System.out.println("Display area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}

public class inheritance {
    public static void main(String[] args) {
        // Triangle t1 = new Triangle();
        // t1.area(5, 4);

        // EquilateralTriangle t2 = new EquilateralTriangle();
        // t2.area(50,40);

        // Circle c1 = new Circle();
        // c1.area(7);

        bank.Account acc = new bank.Account();
        acc.name = "dev";

        acc.displayname();

    }

}
