package homework.lecture2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        IsNumberInRange1 homework1 = new IsNumberInRange1();
        boolean result = homework1.rangeOfNumber(10, 6);

        IsNumberPositive2 homework2 = new IsNumberPositive2();
        int result2 = homework2.theNumber(-5);

        IsNumberNegative3 homework3 = new IsNumberNegative3();
        boolean result3 = homework3.positiveNumber(-10);

        PrintStringWithLoop4 homework4 = new PrintStringWithLoop4();
        String result4 = homework4.twoParametersMethod(4," This string was printed 4 times.");

        IsNumberInRange1 theBigNumber = new IsNumberInRange1();
        boolean resultOfTheyear = homework4.theBigYear(2004);
        System.out.println(" The year is big : " + resultOfTheyear + " .");

        ReplaceArrayElements5 homework5 = new ReplaceArrayElements5();
        int [] reversedArray = homework5.reverseArray();
        System.out.println(Arrays.toString(reversedArray));

        FillAnArray6 homework6 = new FillAnArray6();
        Integer [] filledArray = homework6.fillTheArray();
        System.out.println(Arrays.toString(filledArray));

        MultiplySmallNumbers7 homework7 = new MultiplySmallNumbers7();
        homework7.multiplication();
        System.out.println(Arrays.toString(homework7.arrayOfNumbers));

        PrintTwoDemArray8 homework8 = new PrintTwoDemArray8();
        homework8.square();

        ArrayWithValues9 homework9 = new ArrayWithValues9();
        int [] fillTheArray = homework9.valueArray(10,100);
        System.out.println(Arrays.toString(fillTheArray));

        TwoDemArrayPractice twoDemArrayPractice = new TwoDemArrayPractice();
        twoDemArrayPractice.createTheTable();
    }
}
