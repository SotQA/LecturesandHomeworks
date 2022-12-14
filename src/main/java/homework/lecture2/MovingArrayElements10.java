package homework.lecture2;

public class MovingArrayElements10 {
    public int[] moveElements(int[] arrayOfNumbers, int n) {
        int elementsInArray = arrayOfNumbers.length;
        int slotsToMove = elementsInArray % n;
        for (int i = 0; i < elementsInArray; i++) {
            if (n == elementsInArray) {
                return arrayOfNumbers;
            } else if (n > 0) {

            }
        }
        return null;
    }
}

