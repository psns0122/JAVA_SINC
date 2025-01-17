package day08;


import java.io.*;
public class Test08 {
    public static void main(String[] args) throws IOException {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int totalCount = 0;
        int totalSum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                totalCount++;
                totalSum += array[i][j];
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("total sum : " + String.valueOf(totalSum) + "\n");
        bw.write("total average : " + String.format("%.1f", (double)totalSum / totalCount));
        bw.flush();
    }
}