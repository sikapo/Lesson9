package coffe.order;

import java.util.ArrayList;


public class CoffeeOrderBoard {
    ArrayList<Order> orders = new ArrayList<>();

    public void add (String name){
        if (orders.isEmpty()) {
            orders.add(new Order(name, 1));
        }
        else orders.add(new Order(name, orders.size() + 1));
    }

    public void delivery(){
        orders.remove(0);
    }
    public void delivery(int orderNumber){
        orders.remove(orderNumber);
    }

    public void draw() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
