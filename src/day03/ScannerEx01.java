package day03;

import java.util.Scanner;

public class ScannerEx01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str_x = input.next();
        int x = Integer.parseInt(str_x);
        System.out.println(str_x);
    }
}
