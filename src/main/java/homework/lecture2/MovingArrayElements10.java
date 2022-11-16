package homework.lecture2;

import java.util.ArrayList;

public class MovingArrayElements10 {

    public ArrayList<Integer> moveElementsToSide(ArrayList<Integer> arrayWithElements, int n) {
        int indexesInArray = arrayWithElements.size();
        int moveElementsOn = indexesInArray % n;
        if (moveElementsOn > 0) {

        } else {

        }
        return arrayWithElements;
    }
}
