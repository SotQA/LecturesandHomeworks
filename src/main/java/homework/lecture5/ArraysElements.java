package homework.lecture5;

import java.util.ArrayList;

public class ArraysElements {

    public ArrayList<Integer> experimentArr;

    public ArraysElements(ArrayList<Integer> experimentArr) {
        this.experimentArr = experimentArr;
    }

    public void shiftElementsToRight() {
        int firstElement = experimentArr.get(0);
        int lastElement = experimentArr.get(experimentArr.size() - 1);

        for (int i = 0; i < experimentArr.size(); i++) {
            if (experimentArr.get(i) == lastElement){
                experimentArr.add(0, lastElement);
                experimentArr.remove(lastElement);
            }
        }
    }
    public static void main(String[] args) {

        ArrayList<Integer> argsArr = new ArrayList<>();
        argsArr.add(1);
        argsArr.add(2);
        argsArr.add(3);
        argsArr.add(4);
        argsArr.add(5);

        System.out.println(argsArr);

        ArraysElements swapArr = new ArraysElements(argsArr);
        swapArr.shiftElementsToRight();
        System.out.println(swapArr.experimentArr);
    }
}
