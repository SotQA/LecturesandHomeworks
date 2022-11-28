package homework.lecture5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> boxOranges = new ArrayList<>();
        ArrayList<Integer> boxApples = new ArrayList<>();

        Fruit apple = new Apple();
        Fruit orange = new Orange();

        apple.addFruitsIntoBox(5, boxApples);
        orange.addFruitsIntoBox(4, boxOranges);

        apple.getWeight(boxApples);
        orange.getWeight(boxOranges);

        System.out.println(boxApples);
        System.out.println(boxOranges);
    }
}
