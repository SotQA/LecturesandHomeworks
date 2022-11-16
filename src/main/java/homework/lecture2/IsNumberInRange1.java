package homework.lecture2;

public class IsNumberInRange1 {
    public boolean rangeOfNumber(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        if ((result) >= 10 && (result) <= 20) {
            System.out.println("The number summary is in between 10 and 20 : " + result);
            return true;
        } else {
            System.out.println("The number summary is not in between 10 and 20 : " + result);
            return false;
        }
    }
}
