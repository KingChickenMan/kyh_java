package cond;

public class If5 {
    public static void main(String[] args) {
        //서로 관련이 없는 독립 조건이면 `else if` 를 사용하지 않고 `if` 문을 각각 따로 사용해야 한다.
        int price = 10000;
        int age = 10;
        int dicount = 0;

        if (price >= 10000) {
            dicount = dicount + 1000;
            System.out.println("10000원 이상 구매,1000원 할인");
        }
        if (age <= 10) {
            dicount = dicount + 1000;
            System.out.println("나이가 10살 이하일 때 1000원 할인");
        }

        System.out.println("총 할인 금액: " + dicount + "원");
    }
}
