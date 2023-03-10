package CRM;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    // orderId, orderDate, orderStatus, clientId, products,

    int orderId = 1;
    Date orderDate = new Date();
    //String
    List<Product> products = new ArrayList<>();
}
