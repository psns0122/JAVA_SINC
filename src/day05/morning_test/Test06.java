package day05.morning_test;

public class Test06 {
    public static void main(String[] args) {
        // num의 값 보다 크면서 가장 가까운 10의 배수에서 num을 빼기
        int num = 24;
        System.out.println((int)(num/10+1)*10 - num);
    }
}
/** 출력 결과
 * 6
 */