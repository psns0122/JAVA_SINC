package day08;

//import java.lang.StringBuffer;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("test");
        sb.append("test1");
        sb.append("test2");
        sb.append("test3");
        String result = sb.toString(); // StringBuffer값이 String const로 변경됨 (수정불가)
        System.out.println(result); // testtest1test2test3
        System.out.println(sb.capacity()); // StringBuffer 변수의 배열 용량의 크기 반환 : 34

        // String 각종 문자열 함수
        System.out.println("문자열 추출 : " + result.substring(2, 4));
        // 문자열 추출 : st
        System.out.println("문자열 길이 : " + result.length());
        // 문자열 길이 : 19

        // 아래 코드는 에러 발생 (String은 언뮤터블 타입, 수정이 안되는 Const 상수이기 때문에)
        // System.out.println("문자열 원하는 곳에 추가 : " + result.insert(7, "_"));
        // System.out.println("문자열 삭제 : " + result.delete(3, 6));
        // System.out.println("문자열 끝에 추가 : " + result.append("^^"));

        // 이건 result를 수정한게 아니라 새로운 문자열 상수로 연결을 이동한 것
        System.out.println(result += "*"); // testtest1test2test3*

        // StringBuffer 각종 문자열 함수
        StringBuffer sb2 = new StringBuffer(result);
        System.out.println("문자열 추출 : " + sb2.substring(2, 4));
        // 문자열 추출 : st
        System.out.println("문자열 길이 : " + sb2.length());
        // 문자열 길이 : 19
        System.out.println("문자열 원하는 곳에 추가 : " + sb2.insert(7, "_"));
        // 문자열 원하는 곳에 추가 : testtes_t1test2test3
        System.out.println("문자열 삭제 : " + sb2.delete(3, 6));
        // 문자열 삭제 : tess_t1test2test3
        System.out.println("문자열 끝에 추가 : " + sb2.append("^^"));
        // 문자열 끝에 추가 : tess_t1test2test3^^
        // StringBuffer는 변동이 되므로, 수정이 끝났다면 String(const)로 변경해주는게 좋음
        String str = sb2.toString();

        // StringBuilder
        StringBuilder sb3 = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb3.append(i);
        }
        final String number = sb3.toString(); // 상수화
        System.out.println(number);

        // StringBuilder와 StringBuffer의 차이점
        // 둘 다 사용방법은 동일하다
        // StringBuilder : 성능이 스트링버퍼보다 우수
        // StringBuffer : 쓰레드 세이프한 환경을 제공 (동시성 제어를 하기 때문에 안전하지만 속도가 떨어짐)
        // 따라서, 실행 도중에 문자열 변경이 필요하다면 StringBuffer,
        // 처음부터 문자열 데이터를 변경하고 돌릴거라면 StringBuilder가 이득이다.

        StringBuffer stringbuffer = new StringBuffer();
        StringBuilder stringbuilder = new StringBuilder();
        new Thread(()-> {
            for (int i = 0; i<100000; i++) {
                stringbuffer.append(1);
                stringbuilder.append(1);
            }
        }).start();

        new Thread(()-> {
            for (int i = 0; i<100000; i++) {
                stringbuffer.append(1);
                stringbuilder.append(1);
            }
        }).start();

        new Thread(()->{
            try {
                Thread.sleep(2000); // 2초, 밀리초 단위
                System.out.println("stringbuffer.length : " + stringbuffer.length());
                // stringbuffer.length : 200000
                System.out.println("stringbuilder.length : " + stringbuilder.length());
                // stringbuilder.length : 198500 (쓰레드 세이프한 환경을 제공)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

    }
}
