package dat02;

/*
1. "Hello Java" 문자열을 출력하는 HelloJava 클래스를 작성하세요.
2. "Hello Java"를 출력한 후 사용자에게 이름을 입력받아 "Hello 구탱이"를 출력하세요.
 */

import java.util.Scanner;

public class HelloJava {
    public static void main(String[] args) {

        //1.
        System.out.println("Hello Java \n");

        //2.
        Scanner in = new Scanner(System.in);
        callName();
        System.out.print("이름을 입력하세요 : ");
        String name = in.next();
        System.out.println("Hello " + name);

        callName();
        callName();
        callName();
        String eat = callStringName();
        System.out.println(eat);
        System.out.println("맛있다 냠냠");
        System.out.println(eat);

        callStringParam(eat);

    }

    public static void callName(){
        System.out.println("내 이름을 불러죠... 아하하하");
    }

    public static String callStringName(){
        String name = "라면";
        return name;
    }

    public static void callStringParam(String eat) {
        System.out.println(eat + "callString Param 처리 완료");
    }
}
