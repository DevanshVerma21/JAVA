class OlaFare {

    double calculateFare(double distance) {
        return 10 + (distance * 8);
    }

    double calculateFare(double distance, int time) {
        return 10 + (distance * 8) + (time * 1);
    }

    double calculateFare(double distance, int time, double surge) {
        double fare = 10 + (distance * 8) + (time * 1);
        return fare * surge;
    }
}

public class farecalculator {
    public static void main(String[] args) {

        OlaFare o = new OlaFare();

        System.out.println("Fare 1: " + o.calculateFare(10));
        System.out.println("Fare 2: " + o.calculateFare(10, 15));
        System.out.println("Fare 3: " + o.calculateFare(10, 15, 1.5));
    }

}
