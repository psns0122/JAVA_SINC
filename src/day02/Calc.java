package dat02;

import java.util.Scanner;

public class Calc {
    static Scanner in = new Scanner(System.in);

    public static int calcAdd(int one, int two) {
        return one + two;
    }

    public static int calcSub(int one, int two) {
        return one + two;
    }

    public static int calcMod(int one, int two) {
        return one / two;
    }

    public static int calcMul(int one, int two) {
        return one * two;
    }

    public static void printCalcResult(int one, char op, int two) {
        int result = switch (op) {
            case '+' -> calcAdd(one, two);
            case '-' -> calcSub(one, two);
            case '/' -> calcMod(one, two);
            case '*' -> calcMul(one, two);
            default -> -1;
        };

        System.out.println(one + " " + op + " " + two + " = " + result);
    }

    public static void main(String[] args) {

        int value = 10;

        System.out.print("value는 10입니다. value에 더할 값을 입력하세요 : ");
        int myValue = in.nextInt();

        printCalcResult(value, '+', myValue);

    }
}
