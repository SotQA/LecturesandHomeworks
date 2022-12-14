package homework.lecture2;

public class PrintStringWithLoop4 {
    public String twoParametersMethod(int number, String str) {
        for (int i = 0; i < number; i++) {
            System.out.println(str);
        }
        return str;
    }

    public void theBigYear(int year) {
        if(year % 4 == 0 || year == 400){
            System.out.println("The year is big");
        } else{
            System.out.println("The year is not big.");
        }
    }
}
