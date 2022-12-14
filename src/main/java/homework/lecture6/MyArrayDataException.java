package homework.lecture6;

public class MyArrayDataException extends Exception {
    private int positionVertical;
    private int positionHorizontal;

    public MyArrayDataException(int positionVertical, int positionHorizontal){
        this.positionVertical = positionVertical;
        this.positionHorizontal = positionHorizontal;
    }

    public int getPositionVertical() {
        return positionVertical;
    }

    public int getPositionHorizontal() {
        return positionHorizontal;
    }
}
