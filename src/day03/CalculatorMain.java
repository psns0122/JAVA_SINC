package day03;

public class CalculatorMain {

    // 메인 함수
    public static void main(String[] args) {

        Calculator c = new Calculator();

        while(c.calcInt()){
            System.out.println("\n계산기를 반복합니다. 종료하려면 exit을 입력하세요.");
            System.out.println("--------------------\n");
        }
        System.out.println("\n계산기를 종료합니다. 안녕히 가세요.");

    }

}
