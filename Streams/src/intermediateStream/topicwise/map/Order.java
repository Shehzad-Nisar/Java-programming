package intermediateStream.topicwise.map;

import java.util.Arrays;
import java.util.List;

public class Order {

    String cusName;
    String orderID;
    double price ;

    public Order(String cusName, String orderID, double price) {
        this.cusName = cusName;
        this.orderID = orderID;
        this.price = price;
    }
}


class Main{
    static void main() {
        List<Order> orders = Arrays.asList(
                new Order("Ali",     "ORD001", 2500.0),
                new Order("Ahmed",   "ORD002", 1200.0),
                new Order("Sara",    "ORD003", 3500.0),
                new Order("Ayesha",  "ORD004", 1800.0),
                new Order("Usman",   "ORD005", 5000.0),
                new Order("Hassan",  "ORD006", 750.0),
                new Order("Fatima",  "ORD007", 4200.0),
                new Order("Bilal",   "ORD008", 2100.0),
                new Order("Hira",    "ORD009", 3200.0),
                new Order("Hamza",   "ORD010", 1500.0)
        );

        List<String> onlyId = orders.stream()
                .map(order-> order.orderID)
                .toList();

        System.out.println("List containing only orderIDs :" + onlyId);
    }
}