class Ride {
    double calculateFare(double distance) {
        return 0;
    }
}

class NormalRide extends Ride{
    double calculateFare(double distance){
        return 20 + (distance * 8);
    }
}

class PremiumRide extends Ride{
    double calculateFare(double distance){
        return 40 + (distance * 12);
    }
}


public class rideprice {
    public static void main(String[] args) {

        Ride r1 = new NormalRide();
        Ride r2 = new PremiumRide();

        System.out.println("Normal Ride Fare: " + r1.calculateFare(10));
        System.out.println("Premium Ride Fare: " + r2.calculateFare(10));
    }

}
