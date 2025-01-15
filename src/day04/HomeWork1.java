package day04;

public class HomeWork1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = (++x) + (y--);
        System.out.println(z);
    }
}

/**
 * 출력 결과
 * 31
 */