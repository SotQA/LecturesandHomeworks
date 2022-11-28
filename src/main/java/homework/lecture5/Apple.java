package homework.lecture5;

import java.util.ArrayList;

public class Apple extends Fruit {
    
    float appleWeight = 1.0f;

    public Apple() {

    }

    @Override
    public float getWeight(ArrayList<Integer> box) {
        float result = appleWeight * box.get(0);
        System.out.println(" The weight of the box is : " + result);
        return result;
    }

    @Override
    public void addFruitsIntoBox(int fruits, ArrayList<Integer> box) {
        box.add(fruits);
    }
}
