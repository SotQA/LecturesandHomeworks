package homework.lecture6;

import java.util.ArrayList;

public class Box {
    ArrayList<Orange> boxOfFuckingOranges = new ArrayList<>();
    ArrayList<Apple> boxOfFuckingApples = new ArrayList<>();

    public float getWeightOranges() {
        float result = boxOfFuckingOranges.get(0).getOrangeWeight() * boxOfFuckingOranges.size();
        System.out.println(" The weight of the fucking box of oranges is : " + result);
        return result;
    }

    public float getWeightApples() {
        float result = boxOfFuckingApples.get(0).getAppleWeight() * boxOfFuckingApples.size();
        System.out.println(" The weight of the fucking box of apples is : " + result);
        return result;
    }

    public void addFuckingOrangeIntoFuckingBox(int amountOfOranges) {
        for (int i = 0; i < amountOfOranges; i++) {
            boxOfFuckingOranges.add(new Orange());
        }
    }

    public void addApplesToBox(int amountOfApples) {
        for (int i = 0; i < amountOfApples; i++) {
            boxOfFuckingApples.add(new Apple());
        }
    }

    public void compare(float boxApples, float boxOranges) {
        if (boxApples > boxOranges) {
            System.out.println(" The box with apples is heavier : ");
        } else if (boxApples == boxOranges) {
            System.out.println(" The boxes are equal.");
        } else {
            System.out.println(" The box with oranges is heavier");
        }
    }
}
