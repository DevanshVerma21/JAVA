class AmazonShipping {

    double shippingCost(double weight) {
        return 50 + (weight * 10);
    }

    double shippingCost(double weight, double l, double w, double h) {
        return 50 + ((l * w * h) / 100) + (weight * 20);
    }

    double shippingCost(double weight, double l, double w, double h, boolean fragile) {
        double cost = 50 + ((l * w * h) / 100) + (weight * 20);
        return fragile ? cost + 100 : cost;
    }

}

public class shippingsystem {
    public static void main(String[] args) {

        AmazonShipping a = new AmazonShipping();

        System.out.println("Small package cost: " + a.shippingCost(2));
        System.out.println("Medium package cost: " + a.shippingCost(5, 20, 10, 5));
        System.out.println("Large package cost: " + a.shippingCost(5, 20, 10, 5, true));
    }

}
