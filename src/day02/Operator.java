package dat02;

public class Operator {
    public static void main(String[] args) {

        int kor = 77, eng = 87;

        int sum = Calc.calcAdd(kor, eng);
        int avg = Calc.calcMod(sum, 2);

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);

    }
}
