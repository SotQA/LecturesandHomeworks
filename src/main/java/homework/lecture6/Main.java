package homework.lecture6;

public class Main {
    public static void main(String[] args) {
        Box boxOfFuckingOranges = new Box();
        Box boxOfApples = new Box();

        boxOfFuckingOranges.addFuckingOrangeIntoFuckingBox(6);
        float resultOrange = boxOfFuckingOranges.getWeightOranges();

        boxOfApples.addApplesToBox(9);
        float resultApple = boxOfApples.getWeightApples();

        boxOfApples.compare(resultApple, resultOrange);
    }
}
