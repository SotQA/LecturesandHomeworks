package homework.lecture2;

public class IsNumberPositive2 {
    public int theNumber(int number) {
        if (number >= 0) {
            System.out.println("The number is positive: " + number);
        } else {
            System.out.println("The number is negative : " + number);
        }
        return number;
    }
}
