package homework.lecture5;

import java.util.ArrayList;

public class Orange extends Fruit {

    float orangeWeight = 1.5f;

    public Orange() {

    }

    @Override
    public float getWeight(ArrayList<Integer> box) {
        float result = orangeWeight * box.get(0);
        System.out.println(" The weight of the box is : " + result);
        return result;
    }

    @Override
    public void addFruitsIntoBox(int fruits, ArrayList<Integer> box) {
        box.add(fruits);
    }
}
