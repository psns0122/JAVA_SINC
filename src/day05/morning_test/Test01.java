package day05.morning_test;

public class Test01 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A'; // A : 65

        // 1+x가 먼저 연산됨 -> 3
        // int == 4byte == 32bit -> 33 % 32 == 1
        // 따라서 << 33 은 실제로는 << 1로 계산
        // 왼쪽 쉬프트 연산자 1번당 *2 이므로, 3*2 == 6
        System.out.println(1+x << 33);

        // || 보다 && 의 우선순위가 높음
        // 따라서 y >= 5의 결과가 전체 결과를 좌우함 -> true
        System.out.println(y >= 5 || x < 0 && x > 2);

        // x++먼저 실행 (후위연산자이므로 x값에 변동X)
        // 10-x=8, y=y+8 -> 13
        System.out.println(y+=10-x++);
        System.out.println(x+=2);
        System.out.println(!('A' <= c && c <= 'z'));
        System.out.println('c'-c);
        System.out.println('5'-'0'); // '0' : 48
        System.out.println(c+1);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);
    }
}

/**
 * 출력 결과
 * 6
 * true
 * 13
 * 5
 * false
 * 34
 * 5
 * 66
 * B
 * B
 * C
 */