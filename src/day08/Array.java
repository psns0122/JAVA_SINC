package day08;

public class Array {
    public static void main(String[] args) {
        // 1차원 기본 배열 선언+초기화
        int[] num1_1 = {1, 2, 3};
        int num1_2[] = {4, 5, 6}; // 권장되지 않는 스타일

        // 1차원 배열 동적할당 선언만
        int size = 5;
        int[] num2_1_1;
        int num2_1_2[]; // 권장되지 않는 스타일

        // 1차원 배열 동적할당 선언+생성
        int[] num2_2_1 = new int[size];
        int num2_2_2[] = new int[size]; // 권장되지 않는 스타일

        // 1차원 배열 동적할당 선언+생성+초기화
        int[] num2_3_1 = new int[] {1, 2, 3, 4, 5};
        int num2_3_2[] = new int[] {1, 2, 3, 4, 5}; // 권장되지 않는 스타일
    }
}
