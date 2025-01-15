package day05.morning_test;

public class Test09 {
    public static void main(String[] args) {
        // 문자형 ch가 대문자, 소문자, 숫자일 때문 true
        char ch = 'z';
        boolean b = (ch >= 65 && ch <= 90 || ch >=97 && ch <=122 || ch >= 48 && ch <= 57);
        System.out.println(b);
    }
}
/**
 * 출력결과
 * true
 */