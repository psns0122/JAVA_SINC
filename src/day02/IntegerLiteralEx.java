package day02;

public class IntegerLiteralEx {
    public static void main(String[] args) {

        // 10진수 11을 이진수로 저장하려고 한다. 어떻게 표현하면 될까?
        int b = 0b1011; // == 00001011(2) == 11(10)
        System.out.println(b);

        int o = 013; // == 00/001/011(2) == 11(10)
        System.out.println(o);

        int ox = 0xB; // == 0000/1011(2) == 11(10)
        System.out.println(ox);

        // 문제풀이)
        int var1 = 0b1011;
        int var2 = 0206;
        int var3 = 365;
        int var4 = 0xB3;
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);

    }
}
