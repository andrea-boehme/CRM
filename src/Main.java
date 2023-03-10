import CRM.Product;
import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        Product apple = new Product("apple", 2.00, true);
        //apple.productName = "Apple";
        //apple.productUnitPrice = 2.00;
        //apple.productAvailability = true;

        Product banana = new Product("Banana", 3.00, true);

        Product orange = new Product("Orange", 3.50, false);


    System.out.println("apple id: " + apple.getProductId() + " apple name: " +  apple.getProductName());

        System.out.println("Are oranges available? " + orange.getProductAvailability());
        orange.setProductAvailability(true);
        System.out.println("Are oranges available now?" + orange.getProductAvailability());


        System.out.println(apple);
    }
}

/*
for (int i = 0; i < 100; i++) {
            Product p = new Product();
            p.productName = "Banana";
            //System.out.println(p.getProductId());
            System.out.println(p);
        }
 */