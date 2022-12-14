package homework.lecture4;

import java.util.ArrayList;

public class Payment {
    static ArrayList<Goods> cart = new ArrayList<>();

    public static void addToCart(Goods good) {
        cart.add(good);
        System.out.println("Your device" + good.deviceInformation + " has been successfully added to a cart!");
    }

    public static void purchase() {
        System.out.println("You just bought " + cart.size() + " items! \nThank you for the purchase in our shop!");
    }

    public static class Goods {
        public String deviceType;
        public String deviceInformation;
        public String deviceCondition;
        public int devicePrice;

        public Goods(String deviceType, String deviceInformation, String deviceCondition, int devicePrice) {
            this.deviceType = deviceType;
            this.deviceInformation = deviceInformation;
            this.deviceCondition = deviceCondition;
            this.devicePrice = devicePrice;
        }
    }

    public static void main(String[] args) {
        Goods laptop = new Goods("Laptop", " HP 3001 Max", "New", 3000);
        Goods PC = new Goods("PC", "GefForce Blah300", "New", 6000);
        Goods console = new Goods("PS4", "Playstation 4 Pro", "In use", 3700);
        Goods phone = new Goods("Cell Phone", "iPhone 13 Pro Max 256GB", "New", 5800);

        addToCart(laptop);
        addToCart(PC);
        addToCart(console);

        purchase();

    }
}

