package variable;

public class Var8 {
    public static void main(String[] args) {
        //정수
        byte b = 127; //-128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; //-2,147,483,648 ~ 2,147,483,647 (약 20억)
        long l = 9223372036854775807L;
        //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807

        //실수
        float f = 10.0f;
        double d = 10.0;

        /*
        `boolean` : `true` , `false` (1byte)
        `char` : 문자 하나(2byte)
        `String` : 문자열을 표현한다. 메모리 사용량은 문자 길이에 따라 동적으로 달라진다.
        (특별한 타입이다. 자세한 내용은 뒤에서 학습한다)
         */
    }
}
