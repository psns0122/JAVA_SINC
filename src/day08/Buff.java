package day08;

import java.io.*;
import java.util.StringTokenizer;

// Buffer => Scanner에 비해서 속도가 우수
public class Buff {
    // main에서 입출력 오류가 발생하면 IOException에서 처리하도록 전달
    public static void main(String[] args) throws IOException {
        // System.in : 지하수
        // InputStreamReader : 수도관
        // BufferedReader : 공급된 물을 저장해두는 필터
        // 버퍼(필터)가 필요한 이유 : Cpu와 메모리 사이에 속도차이를 보완해서 끊김없이 입력이 전달되도록 도움
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("아무거나 입력해주세요 : "); bw.flush();
        String str = br.readLine(); // 한줄에 입력받기 (IOException 예외처리 필수)
        bw.write(str + "\n"); // str 문자열 내용을 출력
        bw.flush(); // 버퍼 비우기 (혹시모르게 남아있는 값으로 에러가 발생하지 않기 위해)

        // 정수 입력 예제
        bw.write("정수 입력해주세요 : "); bw.flush(); // 반드시 flush 해야함
        int number = Integer.parseInt(br.readLine());
        bw.write(number + 1 + "\n"); bw.flush();

        // String.StringTokenizer() 와 함께 사용하는 예제
        for (int i = 1; i <= number; i++) {
            bw.write("정수 두 개를 띄어쓰기로 나눠서 입력해주세요 : "); bw.flush();
            StringTokenizer st = new StringTokenizer(br.readLine()); // 문자열로 입력받기
            int first = Integer.parseInt(st.nextToken()); // 첫번째로 입력된 숫자 저장
            int second = Integer.parseInt(st.nextToken()); // 두번재로 입력된 숫자 저장
            bw.write(String.valueOf(first) + " " + String.valueOf(second) + "\n");
            bw.flush();
        }
    }
}

