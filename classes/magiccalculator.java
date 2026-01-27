class MagicCalc{

    int add(int a,int b){
        return a+b;
    }

    double add(double a,double b){
        return a + b;
    }

    int add(int a,int b,int c){
        return a + b +c;
    }

}

public class magiccalculator {
     public static void main(String[] args) {
        MagicCalc m = new MagicCalc();

        System.out.println("Sum (int): " + m.add(5, 10));
        System.out.println("Sum (double): " + m.add(4.5, 2.3));
        System.out.println("Sum (three ints): " + m.add(3, 6, 9));
    }
    
}
