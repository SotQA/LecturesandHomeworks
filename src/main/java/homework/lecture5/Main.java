package homework.lecture5;

public class Main {
    public static void main(String[] args) {
        Box<Orange> boxOfOranges = new Box<>(new Orange(1.5f), 15);
        Box<Apple> boxOfApples = new Box<>(new Apple(1.0f), 19);
        Box<Orange> extraBox = new Box<>();

        System.out.println("Now there are " + boxOfOranges.boxOfFruits.size() + " oranges in the box.  " + "\nNow there are " + boxOfApples.boxOfFruits.size() + " apples in the box.");

        float weightOfOrangesBox = boxOfOranges.getWeight();
        float weightOfApplesBox = boxOfApples.getWeight();
        System.out.println("The weight of the box of oranges is : " + weightOfOrangesBox + " ." + "\nThe weight of the box of apples is: " + weightOfApplesBox + " .");

        boolean isEqual = boxOfOranges.compare(boxOfApples);
        System.out.println("The boxes are equal in weight: " + isEqual + " .");

        extraBox.addFruitsFromBox(boxOfOranges, 5);
        System.out.println("Now we take oranges from the box of oranges and put them into the extra box .");

        System.out.println("Now there are " + boxOfOranges.boxOfFruits.size() + " oranges in the box.");
        System.out.println("Now there are " + boxOfApples.boxOfFruits.size() + " apples in the box.");
        System.out.println("Now there are " + extraBox.boxOfFruits.size() + " fruits in the extra box.");

        System.out.println("The weight of the box of oranges is : " + boxOfOranges.getWeight() + " .");
        System.out.println("The weight of the box of apples is : " + boxOfApples.getWeight() + " .");
    }
}