class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Something....");
    }

    public void printcolor(){
        System.out.println(this.color);
    }  
}


public class pendata {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "red";
        p1.type = "gel";
        // p1.write();
        Pen p2 = new Pen();
        p2.color = "blue";
        p2.type = "ball";

        p1.printcolor();
        p2.printcolor();

    }
    
}
