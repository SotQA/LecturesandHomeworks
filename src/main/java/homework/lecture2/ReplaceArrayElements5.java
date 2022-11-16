package homework.lecture2;

public class ReplaceArrayElements5 {
    public int[] numbers = {1, 0, 1, 0, 0, 1, 0, 1, 1};

    public int[] reverseArray() {
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 0){
                numbers[i] = 1;
            } else {
                numbers[i] = 0;
            }
        }
        return numbers;
    }

}

