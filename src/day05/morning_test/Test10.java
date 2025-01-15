package day05.morning_test;

public class Test10 {
    public static void main(String[] args) {
        // 대문자를 소문자로 변경하는 코드
        // ch가 대문자인 경우에만 변경
        char ch = 'A';
        char lowerCase = (ch >= 65 && ch <= 90)?(char)(ch+32):ch;
        System.out.println("ch:" + ch);
        System.out.println("ch to lowerCase:" + lowerCase);
    }
}
/**
 * 출력결과
 * ch:A
 * ch to lowerCase:a
 */