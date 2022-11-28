package homework.lecture5;

import java.util.ArrayList;

public class Box {

    ArrayList<Orange> oranges = new ArrayList<>();

    public float getWeight() {
        oranges.add(new Orange());
        return oranges.get(0).orangeWeight * oranges.size();

    }
}