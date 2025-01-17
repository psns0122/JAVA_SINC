package day08;

import java.io.*;

public class Test07 {
    public static void main(String[] args) throws IOException {
        int[] array = { 1, 5, 3, 8, 2 };
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(max));
        bw.flush();
    }
}