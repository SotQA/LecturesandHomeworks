package homework.lecture6;

public class Main {
    public static void main(String[] args) {
        Box<Orange> boxOfOranges = new Box<>(new Orange(),12);
        Box<Apple> boxOfApples = new Box<>(new Apple(), 17);

        boxOfOranges.getWeightOranges();
        boxOfApples.getWeightApples();



    }
}