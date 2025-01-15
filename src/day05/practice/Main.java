package day05.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int score = 0;
        boolean t = true;
        while(t) {
            System.out.println("1. 입력하기\n2. 출력하기\n3. 삭제하기\n4. 끝내기\n작업할 번호를 선택하세요. ");
            score = in.nextInt();

            switch (score){
                case 1:
                    System.out.println("\n출력하기를 선택하였습니다.");
                    break;
                case 2:
                    System.out.println("\n입력하기를 선택하였습니다.");
                    break;
                case 3:
                    System.out.println("\n삭제하기를 선택하였습니다.");
                    break;
                case 4:
                    System.out.println("\n끝내기를 선택하였습니다.");
                    t = false;
                    break;
                default:
                    System.out.println("\n잘못 입력하였습니다.");
                    break;
            }
        }

    }
}