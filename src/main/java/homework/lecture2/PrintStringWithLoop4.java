package homework.lecture2;

public class PrintStringWithLoop4 {
    public String twoParametersMethod(int number, String str) {
        for (int i = 0; i < number; i++) {
            System.out.println(str);
        }
        return str;
    }

    public boolean theBigYear(int number) {
        if (number % 4 == 0 && number % 400 == 0) {
            return true;
        } else if (number == 100) {
            return false;
        }
        return false;
    }
}
