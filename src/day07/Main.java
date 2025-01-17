package day07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 가로 X 세로 Y 괭이질 N번 : 첫번재 줄에 입력됨
        // (문제에서 말하는 RC가 문맥상 XY같음)
        int X = in.nextInt();
        int Y = in.nextInt();
        int N = in.nextInt();

        // 밭의 상태를 저장할 배열 (0:안 갈림, 1:갈림)
        int[][] bat = new int[240][240];

        // i번재 괭이질은 (sx, sy)부터 (ex, ey)까지의 직사각형 구간의 밭
        // sx, sy, ex, ey는 N줄에 걸쳐서 입력이 이뤄짐
        int sx, sy, ex, ey;
        for (int n = 0; n < N; n++) {
            sx = in.nextInt(); // 1  // 1
            sy = in.nextInt(); // 1  // 3
            ex = in.nextInt(); // 2  // 5
            ey = in.nextInt(); // 4  // 4

            for (int i = sy - 1; i < ey; i++) {
                for (int j = sx - 1; j < ex; j++) {
                    bat[i][j] = 1;
                }
            }

        }

        // 갈린 밭의 수를 출력
        int count = 0;
        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++) {
                if (bat[i][j] == 1) count++;
            }
        }
        System.out.println(count);
    }
}
