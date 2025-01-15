package day04;

public class HomeWork2 {
    public static void main(String[] args) {
        int score = 85;
        String result = (!(score>90)) ? "가" : "나";
        System.out.println(result);
    }
}

/**
 * 출력 결과
 * !(score>90) -> true
 * 따라서 "가"
 */