package day08;

import java.io.*;

public class MutiArrayEx {
    public static void main(String[] args) throws IOException {
        int [][] scores = {
                {80, 90, 96},
                {76,88}
        };

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("몇 반의 평균을 구할까요? (" + String.valueOf(scores.length) + "개의 반 존재) : ");
        bw.flush();
        int index = Integer.parseInt(br.readLine()) - 1;
        int sum = 0;
        for (int score : scores[index]) {
            sum += score;
        }

        bw.write(String.valueOf(index + 1) + "반의 평균은 " + String.format("%.2f", (double)sum/scores[index].length) + "점 입니다.");
        bw.flush();

    }
}
