package day03;

// 1. 두개의 정수와 사칙연산 기호를 입려받아 연산을 출력한다
// 2. "exit"문자가 입력되기 전까지 사칙연산을 수행하는 루틴을 만든다.

import java.util.Scanner;

public class Calculator {
    Scanner in = new Scanner(System.in);

    // 사칙연산 함수
    void add(int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
    void sub(int num1, int num2) {
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }
    void mul(int num1, int num2) {
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }
    void div(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("0으로는 나눌 수 없습니다.");
            return;
        }
        System.out.println(num1 + " / " + num2 + " = " + (double)(num1 / num2));
    }

    // 종료 확인 함수
    String getInputAndCheckExit(String str) {
        System.out.print(str);
        String input = in.nextLine();
        if ("exit".equals(input.toLowerCase())) return "true";
        else return input;
    }

    // 정수 계산기 함수
    boolean calcInt() {
        System.out.println("정수 계산기를 시작합니다.");

        String str_num1 = getInputAndCheckExit("첫번째 정수를 입력하세요 : ");
        if (str_num1.equals("true")) return false;
        String op = getInputAndCheckExit("연산자를 입력하세요 : ");
        if (op.equals("true")) return false;
        String str_num2 = getInputAndCheckExit("두번째 정수를 입력하세요 : ");
        if (str_num2.equals("true")) return false;

        int num1 = Integer.parseInt(str_num1);
        int num2 = Integer.parseInt(str_num2);

        switch (op) {
            case "+": add(num1, num2); break;
            case "-": sub(num1, num2); break;
            case "*": mul(num1, num2); break;
            case "/": div(num1, num2); break;
            default:
                System.out.println("잘못된 연산자를 입력했습니다. 처음부터 다시 입력하세요.");
        }

        return true;
    }
}

