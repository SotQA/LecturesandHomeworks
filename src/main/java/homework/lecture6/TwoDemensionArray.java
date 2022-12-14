package homework.lecture6;

public class TwoDemensionArray {

    public void checkSizeOfArray(String[][] array) {
        int rows = array.length;
        int columns = array[0].length;

        try {
            if (rows != 4 || columns != 4) {
                throw new SizeOfArrayException(" Unfortunately you have array not of 4 elements!");
            }
        } catch (SizeOfArrayException exception) {
            System.out.println(exception.getName());
        }
    }

    public void fillTheArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "1";
                if (i == 2 || j == 3) {
                    array[i][j] = "@";
                }
            }
        }
    }

    public void arrayIntoInt(String[][] stringsArray) throws MyArrayDataException {
        int sum = 0;
        int[][] intArray = new int[stringsArray.length][stringsArray[0].length];
        for (int i = 0; i < stringsArray.length; i++) {
            for (int j = 0; j < stringsArray.length; j++) {
                try {
                    intArray[i][j] = Integer.parseInt(stringsArray[i][j]);
                    sum += intArray[i][j];
                } catch (Exception e) {
                    MyArrayDataException exc = new MyArrayDataException(i, j);
                    System.out.println("The array number : " + exc.getPositionVertical() + " has symbols on positions :" +  exc.getPositionHorizontal() + ".");
//                    throw new MyArrayDataException(exc.getPositionVertical(), exc.getPositionHorizontal());
                }
            }
        }
        System.out.println("The summary of the numbers in the array of arrays is : " + sum + " .");
    }
}
