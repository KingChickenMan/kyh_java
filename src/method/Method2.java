package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램을 동작합니다.");
        printFooter();


    }

    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다 =");
        return;
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 =");
    }

    /*
    모든 메서드는 항상 `return` 을 호출해야 한다.
     그런데 반환 타입 `void` 의 경우에는 예외로 `printFooter()` 와 같 이 생략해도 된다.
     자바가 반환 타입이 없는 경우에는 `return` 을 마지막줄에 넣어준다.
     참고로 `return` 을 만나면 해 당 메서드는 종료된다.
     */
}

