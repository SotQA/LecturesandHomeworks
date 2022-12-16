package homework.lecture6;

public class Main {
    public static void main(String[] args) throws Exception {
        TwoDemensionArray obj = new TwoDemensionArray();
        String[][] theArray = new String[4][4];

        obj.checkSizeOfArray(theArray);
        obj.fillTheArray(theArray);
        obj.arrayIntoInt(theArray);
    }
}
