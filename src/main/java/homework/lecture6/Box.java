package homework.lecture6;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    ArrayList<T> boxOfFruits = new ArrayList<>();
    T fruit;
    int amountOfFruits;

    public Box(T fruit, int amountOfFruits) {
        this.fruit = fruit;
        this.amountOfFruits = amountOfFruits;
        for (int i = 0; i < amountOfFruits; i++) {
            boxOfFruits.add(fruit);
        }
    }

    public void getWeightOranges() {
        float result = boxOfFruits.get(0).getOrangeWeight() * amountOfFruits;
        System.out.println("The weight of the box of oranges is " + result + " .");
    }

    public void getWeightApples() {
        float result = boxOfFruits.get(0).getAppleWeight() * amountOfFruits;
        System.out.println("The weight of the box of apples is " + result + " .");
    }
}