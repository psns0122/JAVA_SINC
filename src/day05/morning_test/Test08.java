package day05.morning_test;

public class Test08 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        // byte, char, short는 연산 전에 자동으로 int로 형변환 됨
        // 따라서 a+b의 결과는 int
        // 큰 자료형을 작은 자료형에 넣어야하므로 강제 형변환 필요
        byte c = (byte)(a+b);

        char ch = 'A';
        // 위와 동일
        ch = (char) (ch + 2);

        float f = (float)3/2;
        // long 타입의 리터럴로 변경 (안하면 int취급)
        long l = 3000l * 3000l * 3000l;

        float f2 = 0.1f;
        double d = 0.1;

        // 같은 1.0이여도 실수 리터럴 타입에 따라 부동소수점 연산에 차이가 발생
        boolean result = (float)d == f2;

        System.out.println("c="+c);
        System.out.println("ch="+ch);
        System.out.println("f="+f);
        System.out.println("l="+l);
        System.out.println("result="+result);
    }
}
