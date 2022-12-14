package homework.lecture2;

public class FillAnArray6 {
    public Integer[] emptyArray = new Integer[100];

    public Integer[] fillTheArray() {
        for (int i = 0; i < emptyArray.length; i++) {
            emptyArray[i] = i + 1;
        }
        return emptyArray;
    }
}
