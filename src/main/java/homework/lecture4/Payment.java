package homework.lecture4;

import java.util.ArrayList;

public class Payment {

    private ArrayList<Product> products;
    private int totalPrice;

    public Payment(ArrayList<Product> products) {
        this.products = products;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
