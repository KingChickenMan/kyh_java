package casting;

public class Casting1 {
    public static void main(String[] args) {
        //작은 범위에서 큰 범위로는 당연히 값을 넣을 수 있다.
        //예) `int` -> `long` -> `double`
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue); //longValue = 10

        doubleValue = intValue; // int -> double
        System.out.println("doubleValue1 = " + doubleValue); //doubleValue1 = 10.0

        doubleValue = 20L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue); //doubleValue2 = 20.0

        //큰 그릇은 작은 그릇에 담 긴 내용물을 담을 수 있다.

        /*
        //intValue = 10
        doubleValue = intValue
        doubleValue = (double) intValue //형 맞추기
        doubleValue = (double) 10 //변수 값 읽기
        doubleValue = 10.0 //형변환
         */
    }
}
