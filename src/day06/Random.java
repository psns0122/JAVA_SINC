package day06;

public class Random {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
        double dValue = Math.random();
        char cValue = (char)((dValue * 26) + 65);
        System.out.println(cValue);
        }

        /**
         * 0.1 * 6 -> 0.6 / int(0.6 + 1) -> 1
         * 0.2 * 6 -> 1.2 / int(1.2 + 1) -> 2
         * 0.4 * 6 -> 2.4 / int(2.4 + 1) -> 3
         * 0.5 * 6 -> 3.0 / int(3.0 + 1) -> 4
         * 0.7 * 6 -> 4.2 / int(4.2 + 1) -> 5
         * 0.9 * 6 -> 5.4 / int(5.4 + 1) -> 6
         *
         * Math.random()을 사용해서 a~b 범위의 난수 생성 공식
         * int((Math.random() * b) + a)
         */

    }
}
