package day05.morning_test;

public class Test04 {
    public static void main(String[] args) {
        // num의 값 중에서 백의 자리 이하를 버림
        int num = 456;
        System.out.println((int)num/100 * 100);
    }
}
/** 출력 결과
 * 400
 */