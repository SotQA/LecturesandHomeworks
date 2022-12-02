package homework.lecture6;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    final ArrayList<T> boxOfFruits = new ArrayList<>();
    private T fruit;
    private int amountOfFruits;

    public Box(T fruit, int amountOfFruits) {
        this.fruit = fruit;
        this.amountOfFruits = amountOfFruits;
        addFruitsToBox();
    }

    public Box() {

    }

    private void addFruitsToBox() {
        for (int i = 0; i < amountOfFruits; i++) {
            boxOfFruits.add(fruit);
        }
    }

    public float getWeight() {
        return this.boxOfFruits.get(0).getWeight() * this.boxOfFruits.size();
    }

    public boolean compare(Box box) {
        return box.getWeight() == this.getWeight();
    }

    public void addFruitsFromBox(Box<T> box, int unitsOfFruits) {
        if (boxOfFruits.isEmpty()) {
            List<T> fruits = box.getFruits(unitsOfFruits);
            for (int i = 0; i < unitsOfFruits; i++) {
                boxOfFruits.add(fruits.get(i));
                box.boxOfFruits.remove(i);
            }
        }
    }

    public List<T> getFruits(int count) {
        List<T> fruits = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            fruits.add(boxOfFruits.get(i));
        }
        return fruits;
    }
}