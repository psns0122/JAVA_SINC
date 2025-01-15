package day04;

import java.util.Scanner;

public class CompareOperatorEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1 = 10;
        int n2 = 10;
        boolean result = false;

        // 1.n1과 n2 의 값이 같은지를 비교하여 결과를 boolean result1에 저장 후 result1 출력
        result = (n1 == n2);
        System.out.println(result);

        // 2.n1과 n2 의 값이 다른지를 비교하여 결과를 boolean result1에 저장 후 result1 출력
        result = (n1 != n2);
        System.out.println(result);

        // 3.n1과 n2 의 값이 n1이 n2보다 작거나 같은지를 비교하여 결과를 boolean result1에 저장 후 result1 출력
        result = (n1 <= n2);
        System.out.println(result);

        // 4.n1과 n2 의 값이 n1이 n2보다 크거나 같은지를 비교하여 결과를 boolean result1에 저장 후 result1 출력
        result = (n1 >= n2);
        System.out.println(result);

        // 5.n1과 n2 의 값이 n1이 n2보다 작은지를 비교하여 결과를 boolean result1에 저장 후 result1 출력
        result = (n1 < n2);
        System.out.println(result);

        // 6.n1과 n2 의 값이 n1이 n2보다 큰지를 비교하여 결과를 boolean result1에 저장 후 result1 출력
        result = (n1 > n2);
        System.out.println(result);

        // 7. jungol 연산자 - 자가진단 5번 #522
        /* 두개의 정수를 입력
        *  첫 번째 줄에는 두 정수의 값이 같으면 1 아니면 0 출력
        *  두 번째 줄에는 같지 않으면 1 같으면 0 출력
        * */
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println((num1 == num2) ? 1 : 0);
        System.out.println((num1 == num2) ? 0 : 1);

    }
}
