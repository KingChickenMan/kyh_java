package operator;

public class Comp1 {
    public static void main(String[] args) {
        //비교 연산자를 사용하면 참(true) 또는 거짓(false)이라는 결과가 나온다. 참 거짓은 boolean형을 사용한다.
        int a = 2;
        int b = 3;

        System.out.println(a == b); // false, a와 b는 같지 않다
        System.out.println(a != b); // true, a와 b는 다르다
        System.out.println(a > b); // false, a는 b보다 크지 않다
        System.out.println(a < b); // true, a는 b보다 작다
        System.out.println(a >= b); // false, a는 b보다 크거나 같지 않다
        System.out.println(a <= b); // true, a는 b보다 작거나 같다

        //결과를 boolean 변수에 담기
        boolean result = a == b; //a == b: false
        System.out.println(result); //false

        /*
        여기서 주의할 점은 `=` 와 `==` ( `=` x2)이 다르다는 점이다.
        `=` : 대입 연산자, 변수에 값을 대입한다.
        `==` : 동등한지 확인하는 비교 연산자
        */
    }
}
