package homework.lecture2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Homework #1
        IsNumberInRange1 homework1 = new IsNumberInRange1();
        boolean result = homework1.rangeOfNumber(10, 11);
        //Homework #2
        IsNumberPositive2 homework2 = new IsNumberPositive2();
        int result2 = homework2.theNumber(-5);
        //Homework #3
        IsNumberNegative3 homework3 = new IsNumberNegative3();
        boolean result3 = homework3.positiveNumber(-10);
        //Homework #4
        PrintStringWithLoop4 homework4 = new PrintStringWithLoop4();
        String result4 = homework4.twoParametersMethod(10," This string was printed 10 times.");
        homework4.theBigYear(2005);
        //Homework #5
        ReplaceArrayElements5 homework5 = new ReplaceArrayElements5();
        int [] reversedArray = homework5.reverseArray();
        System.out.println(Arrays.toString(reversedArray));
        //Homework #6
        FillAnArray6 homework6 = new FillAnArray6();
        Integer [] filledArray = homework6.fillTheArray();
        System.out.println(Arrays.toString(filledArray));
        //Homework #7
        MultiplySmallNumbers7 homework7 = new MultiplySmallNumbers7();
        homework7.multiplication();
        System.out.println(Arrays.toString(homework7.arrayOfNumbers));
        //Homework #8
        PrintTwoDemArray8 homework8 = new PrintTwoDemArray8();
        homework8.square();
        //Homework #9
        ArrayWithValues9 homework9 = new ArrayWithValues9();
        int [] fillTheArray = homework9.valueArray(10,100);
        System.out.println(Arrays.toString(fillTheArray));
        //Homework #10
        TwoDemArrayPractice twoDemArrayPractice = new TwoDemArrayPractice();
        twoDemArrayPractice.createTheTable();
        //Homework #11
        MovingArrayElements10 movingArrayElements10 = new MovingArrayElements10();
        int [] arrayForTask10 = {1,2,3,4,5,6,7};
        movingArrayElements10.moveElements(arrayForTask10, 5);
        System.out.println(Arrays.toString(arrayForTask10));
    }
}
