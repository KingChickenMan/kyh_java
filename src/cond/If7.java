package cond;

public class If7 {
    public static void main(String[] args) {
        //if` 문 다음에 실행할 명령이 하나만 있을 경우에는 `{}` 중괄호를 생략할 수 있다. `elseif` , `else`도 마찬가지이다.
        if (true)
            System.out.println("if문에서 실행됨");

        //다음과 같은 경우에는 두번째 문장은 `if` 문과 무관하다. 만약 둘다 `if` 문 안에 포함하려면 `{}` 를 사용해야 한다.
        if (true)
            System.out.println("if문에서 실행됨");
        System.out.println("if문에서 실행 안됨");

        //만약 둘다 `if` 문 안에 포함하려면 다음과 같이 `{}` 를 사용해야 한다.
        if (true) {
            System.out.println("if문에서 실행됨");
            System.out.println("if문에서 실행 안됨");
        }
    }
}
