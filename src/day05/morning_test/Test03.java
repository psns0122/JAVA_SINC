package day05.morning_test;

public class Test03 {
    public static void main(String[] args) {
        // 변수 num의 값에 따라 양수, 음수, 0을 출력
        // 삼항 연산자 사용
        int num = 10;
        System.out.println((num < 0)? "음수" : (num == 0) ? '0' : "양수");
    }
}
/**
 * 출력 결과
 * 양수
 */