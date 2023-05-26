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
    public void draw() {
        for (int i = 0; i < orders.size(); i++) {
            System.out.println(orders.get(i));
        }
    }
}
