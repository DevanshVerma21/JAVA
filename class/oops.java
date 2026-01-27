class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("Writing");
    }

    public void printcolor(){
        // System.out.println("Colour:"+ color);
        System.out.println(this.color);
    }


    public void printtype(){
        // System.out.println("Type:"+type);
        System.out.println(this.type);
    }
}

public class oops {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Black";
        pen1.type = "Gel";

        Pen pen2 = new Pen();
        pen2.color = "Blue";
        pen2.type = "Ball";
    
        pen1.write();   
        pen1.printcolor();
        pen1.printtype();

        pen2.write();   
        pen2.printcolor();
        pen2.printtype();
    }
}
