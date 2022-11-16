package homework.lecture2;

public class ArrayWithValues9 {
    public int[] valueArray(int len, int initialValue) {
        int[] emptyArray = new int[len];
        for(int i = 0; i < len; i++){
            emptyArray[i] += initialValue;
        }
        return emptyArray;
    }
}
