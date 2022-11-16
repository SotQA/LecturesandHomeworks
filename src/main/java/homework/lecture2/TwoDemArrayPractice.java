package homework.lecture2;

public class TwoDemArrayPractice {
    int[][] theTable = new int[10][10];

    public void createTheTable() {
        for (int i = 0; i < theTable.length; i++) {
            for (int j = 0; j < theTable.length; j++) {
                if (i == j) {
                    theTable[i][j] += 0;
                } else {
                    theTable[i][j] += 2;
                }
                System.out.print(theTable[i][j]);
            }
            System.out.println();
        }
    }
}