package day05.morning_test;

public class Test07 {
    public static void main(String[] args) {
        // 화씨를 섭씨로 변환하는 코드
        int fahrenheit = 100;
        // (float)실수/정수 -> (float)실수 0.55555...
        // (float)정수/정수 -> (float)정수 0.0
        float celcius = ((float)5/9 * (fahrenheit-32));

        System.out.println("Fahrenheit:" + fahrenheit);
        System.out.printf("Celcius:%.2f", celcius);
    }
}
/**
 * 출력결과
 * Fahrenheit:100
 * Celcius:37.78
 */