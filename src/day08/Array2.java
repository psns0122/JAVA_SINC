package day08;

public class Array2 {
    public static void main(String[] args) {
        // 2차원 기본 배열 선언 + 초기화
        int[][] num1 = {{1, 2, 3, 4, 5, 6, 7, 9},
                        {100, 200},
                        {-1, -2, -3, -4, -5}};

        // 2차원 배열의 동적할당 선언만
        int size = 4;
        int[][] num2;

        // 2차원 배열의 동적할당 선언+생성
        // 1) 행의 길이가 동일한 경우
        int[][] num3_1 = new int[size][size];

        // 2) 길이가 서로 다른 행이 혼합된 경우
        int[][] num3_2 = new int[size][];
        for (int i = 0; i < size; i++) {
            num3_2[i] = new int[i+11];
        }

        // 2차원 배열의 동적할당 선언+생성+초기화
        int[][] num4 = new int[][] {{1, 2, 3, 4, 5, 6, 7, 9},
                                    {100, 200}};
    }
}
