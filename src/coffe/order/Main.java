package coffe.order;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    String[] visitors = {"Bob", "Vitalik", "Chad", "Jed", "Alex"};

    CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();

        for (String visitor : visitors) {
            coffeeOrderBoard.add(visitor);
        }


        coffeeOrderBoard.draw();
    }
}