import java.util.*;

class Product {
    String productName;
    double productPrice;

    Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductDetails() {
        return "Product Name: " + productName + ", Price: $" + productPrice;
    }

}

class Store {
    int storeID;
    String storeName;
    ArrayList<Product> productlist;
    double revenue;

    Store(int storeID, String storeName) {
        this.storeID = storeID;
        this.storeName = storeName;
        this.productlist = new ArrayList<>();
        this.revenue = 0.0;
    }

    public void addProduct(Product product){
        productlist.add(product);
        revenue += product.productPrice;
    }

    public double calculateTotalRevenue(){
        return revenue;
    }

    public void displayStoreInfo() {
        System.out.println("Store ID: " + storeID);
        System.out.println("Store Name: " + storeName);
        System.out.println("Product List: ");
        for (Product product : productlist) {
            System.out.println(product.getProductDetails());
        }
        System.out.println("Total Revenue: $" + calculateTotalRevenue());
    }
}

public class StoreTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // number of test cases (stores)
        sc.nextLine(); // consume newline

        while (T-- > 0) {

            // Read store details
            int storeID = sc.nextInt();
            sc.nextLine(); // consume newline
            String storeName = sc.nextLine();

            Store store = new Store(storeID, storeName);

            // Read number of products
            int n = sc.nextInt();
            sc.nextLine(); // consume newline

            // Read product details
            for (int i = 0; i < n; i++) {
                String productName = sc.nextLine();
                double productPrice = sc.nextDouble();
                sc.nextLine(); // consume newline

                Product product = new Product(productName, productPrice);
                store.addProduct(product);
            }

            // Display store information
            store.displayStoreInfo();
            System.out.println(); // separator between test cases
        }
    }
}
