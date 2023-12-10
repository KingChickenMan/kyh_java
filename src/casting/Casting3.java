package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값
        long maxIntOver = 2147483648L; //int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting=" + intValue); //출력:2147483647

        intValue = (int) maxIntOver;
        System.out.println("maxIntOver casting=" + intValue); //출력:-2147483648

        /* 정상 범위
        maxIntValue = 2147483647; //int 최고값
        intValue=(int)maxIntValue; //변수 값 읽기
        intValue = (int) 2147483647L; //형변환
        intValue = 2147483647;
         */

        /* 초과 범위
        maxIntOver = 2147483648L; //int 최고값 + 1
        intValue=(int)maxIntOver;//변수 값 읽기
        intValue=(int)2147483648L;//형변환 시도
        intValue = -2147483648;
         */

    }
}
