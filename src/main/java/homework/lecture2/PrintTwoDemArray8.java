package homework.lecture2;

public class PrintTwoDemArray8 {
    int sizeVertical = 5;
    int sizeHorizontal = 5;
    public int[][] squareArray = new int[5][5];

    public void square() {
        for (int i = 0; i < sizeVertical; i++) {
            for (int j = 0; j < sizeHorizontal; j++) {
                squareArray[i][j] += 1;
                System.out.print(squareArray[i][j]);
            }
            System.out.println();
        }
    }

}
