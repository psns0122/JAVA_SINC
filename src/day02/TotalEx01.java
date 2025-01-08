package dat02;

import java.util.Scanner;

public class TotalEx01 {
    // 멤버 변수
    static Scanner in = new Scanner(System.in);

    // 메서드
    // 사칙연산 메소드 fourArithmetic
    static void fourArithmetic() {
        System.out.print("첫번째 숫자를 입력해주세요 : ");
        int a = in.nextInt();
        System.out.print("두번째 숫자를 입력해주세요 : ");
        int b = in.nextInt();

        System.out.printf("a + b = %d\n", a+b);
        System.out.printf("a - b = %d\n", a-b);
        System.out.printf("a * b = %d\n", a*b);
        System.out.printf("a / b = %.1f\n\n", (float)a/b);
    }

    // operator 기능 메소드
    public static void operator() {
        System.out.print("국어 점수를 입력해주세요 : ");
        int kor = in.nextInt();
        System.out.print("영어 점수를 입력해주세요 : ");
        int eng = in.nextInt();

        System.out.printf("총점 : %d\n", kor+eng);
        System.out.printf("평균 : %.1f\n\n", (float)(kor+eng)/2);
    }

    public static void main(String[] args) {
        fourArithmetic();
        operator();
    }
}
