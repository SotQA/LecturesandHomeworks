package homework.lecture2;

public class MultiplySmallNumbers7 {
    public int[] arrayOfNumbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

    public void  multiplication() {
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] < 6) {
                arrayOfNumbers[i] *= 2;
            }
        }
    }
}
