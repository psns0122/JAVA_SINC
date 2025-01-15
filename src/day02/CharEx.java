package day02;

import java.sql.SQLOutput;

public class CharEx {
    public static void main(String[] args) {

        char ch1 = 'A'; // 출력결과 : A
        char ch2 = 65; // 출력결과 : A
        char ch3 = '가'; // 출력결과 : 가
        char ch4 = 44032; // 출력결과 : 가

        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(ch4);

        boolean x = true;



String v0 = "Park g.h.";
String v1 = "홍길동";
String v2 = new String("홍길동");
System.out.println(v0.hashCode()); // -121366013
System.out.println(v1.hashCode()); // 54150062
System.out.println(v2.hashCode()); // 54150062
System.out.println("홍길동".hashCode()); // 54150062

System.out.println(v2 == "홍길동"); // false
System.out.println(v1 == "홍길동"); // true
System.out.println(v2.equals("홍길동")); // true

    }
}
