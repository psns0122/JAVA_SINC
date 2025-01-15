package day03;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = 0;
        int b = 1;
        int c = 2;

        if ((a!=0) && (b!=0)) System.out.print(1 + " ");
        else System.out.print(0);

        if ((a!=0) || (b!=0)) System.out.print(1 + " ");
        else System.out.print(0);

        if ((c!=0) && (b!=0)) System.out.print(1 + " ");
        else System.out.print(0);

        if (a!=0) System.out.print(0);
        else System.out.print(1);


        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));

        String str = "나는 자바 \"자바\" 헤헤";
        System.out.println(str);

        // 05
        str = "서식문자로 출력하는 방법입니다. \n 이것은 문자열을 나타냅니다.";
        System.out.println(str);

        str = "수식을 출력하면 게산 결과가 출력됩니다.";
        int aa = 10;
        int bb = 20;
        int result = a+b;
        String str2 = "내 생일은 2005년 1월 1일입니다.";
        System.out.printf("%s\n%d + %d = %d\n%s", str, aa, bb, result, str2);

        float f = 3.14f;
        int i = (int)f;
        System.out.println(i); // 3 (0.14는 로스 발생)
        float f2 = 4.7f;
        float f3 = 5.95f;
        int i2 = (int)f2, i3 = (int)f3;
        System.out.println(i2 + " " + i3);
        String str3 = """
                블록 문법을 사용해볼게요
                자동으로 줄바꿈이 되는걸 볼 수 있어요
                표를 만들때 아주 좋습니당 허허
                수학  영어  과학 
                ==============
                10    20   30
                근데 붙이고 싶으면 \
                이렇게 연결연산자 \\를 써서 연결할 수 있습니다
                """;
        System.out.println(str3);



    }
}
