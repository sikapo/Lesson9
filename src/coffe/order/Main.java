package coffe.order;

public class Main {
    public static void main(String[] args) {
    String[] visitors = {"Bob", "Vitalik", "Chad", "Jed", "Alex"};

    CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();

        for (String visitor : visitors) {
            coffeeOrderBoard.add(visitor);
        }

        coffeeOrderBoard.delivery(2);
        coffeeOrderBoard.draw();
    }
}