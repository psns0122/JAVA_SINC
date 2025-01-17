package day08;

import java.io.*;
import java.util.StringTokenizer;

public class Test09 {
    public static void main(String[] args) throws IOException, NullPointerException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int num = 0; // 학생수
        int[] scores = new int[0]; // 점수를 저장할 변수 (학생수 입력 후 동적할당)

        boolean isBreak = false;

        do {
            bw.write("-------------------------------------------------\n"); bw.flush();
            bw.write("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료\n"); bw.flush();
            bw.write("-------------------------------------------------\n"); bw.flush();
            bw.write("선택> "); bw.flush();
            st = new StringTokenizer(br.readLine());
            int userInput = Integer.parseInt(st.nextToken());

            switch(userInput) {
                case 1: // 학생수
                    bw.write("학생수> "); bw.flush();
                    st = new StringTokenizer(br.readLine());
                    num = Integer.parseInt(st.nextToken());

                    // 입력받은 학생수로 점수 배열 동적할당
                    scores = new int[num];
                    break;

                case 2: // 점수입력
                    if (scores.length == 0) {
                        bw.write("! 학생수를 먼저 입력해주세요 !\n");
                        continue;
                    }
                    for (int i = 0; i < num; i++) {
                        bw.write("scores[" + String.valueOf(i) + "]> "); bw.flush();
                        st = new StringTokenizer(br.readLine());
                        scores[i] = Integer.parseInt(st.nextToken());
                    }
                    break;

                case 3: // 점수리스트
                    if (scores.length == 0) {
                        bw.write("! 학생수를 먼저 입력해주세요 !\n");
                        continue;
                    }
                    for (int i = 0; i < num; i++) {
                        bw.write("scores[" + String.valueOf(i) + "]: " + String.valueOf(scores[i]) + "\n"); bw.flush();
                    }
                    break;

                case 4: // 분석
                    if (scores.length == 0) {
                        bw.write("! 학생수를 먼저 입력해주세요 !\n"); bw.flush();
                        continue;
                    }
                    int max = scores[0]; // 최고점수
                    int sum = scores[0]; // 합계
                    for (int i = 1; i < num; i++) {
                        if (scores[i] > max) max = scores[i];
                        sum += scores[i];
                    }
                    bw.write("최고 점수: " + max + "\n"); bw.flush();
                    bw.write("평균 점수: " + String.format("%.1f", (double)sum/num) + "\n"); bw.flush();
                    break;

                case 5: // 종료
                    bw.write("프로그램 종료\n"); bw.flush();
                    isBreak = true; // do-while 조건문을 빠져나가기 위한 플래그
                    break;

                default:
                    bw.write("! 잘못된 입력입니다 !\n"); bw.flush();
            }
        } while(!isBreak);
    }
}