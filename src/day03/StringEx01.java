package day03;

public class StringEx01 {
    public static void main(String[] args) {

        int num1 = Integer.getInteger("10");
        System.out.println(num1);


        byte value1 = Byte.parseByte("77");
        int value2 = Integer.valueOf("10");
        float value3 = Float.parseFloat("4.99");
        double value4 = Double.parseDouble("3.24");
        boolean value5 = Boolean.parseBoolean("true");

        System.out.println(value1 + 1);     // 78
        System.out.println(value2 + 1); // 11
        System.out.println(value3 + 1); // 5.99
        System.out.println(value4 + 1); // 4.24
        System.out.println(value5); // true

        String str1 = String.valueOf(value1);
        String str2 = String.valueOf(value2);
        String str3 = String.valueOf(value3);
        String str4 = String.valueOf(value4);
        String str5 = String.valueOf(value5);

        System.out.println(str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5);
        // 77 10 4.99 3.24 true
    }
}
