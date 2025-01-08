package day01;

import java.util.Scanner;

public class Calculator {

    // 1+1 = ?
    public static void main(String[] args) {
        // 1. 데이터 입력
        Scanner in = new Scanner(System.in);
        System.out.print("첫번째 숫자 : ");
        int a = in.nextInt();
        System.out.print("두번째 숫자 : ");
        int b = in.nextInt();

        int sum = 0;

        // 2. 데이터 처리
        // 3. 데이터 결과 저장
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        // 4. 결과 출력
        System.out.println(sum);

    }
}
