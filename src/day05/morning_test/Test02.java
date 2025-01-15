package day05.morning_test;

public class Test02 {
    public static void main(String[] args) {
        // 사과를 담는데 필요한 바구니의 수를 구하는 코드
        // 사과의 수가 123개, 하나의 바구니 10개의 사과 가능

        int numOfApples = 123;
        int sizeOfBucket = 10;
        int numOfBucket = numOfApples / sizeOfBucket + ((numOfApples % sizeOfBucket != 0)? 1 : 0);
        System.out.println("필요한 바구니의 수 :" + numOfBucket);
    }
}
/** 출력 결과
 * 필요한 바구니의 수 :13
 */