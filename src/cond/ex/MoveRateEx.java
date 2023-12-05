package cond.ex;

public class MoveRateEx {
    public static void main(String[] args) {
        double rating = 7.1;

        if (rating <= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }if (rating <= 8) {
            System.out.println("'토이 스토리'를 추천합니다.");
        }if (rating <= 7){
            System.out.println("'고질라'를 추천합니다.");
        }
        //`if` 문에 `else if`를 함께 사용하는 것은 서로 연관된 조건일 때 사용한다.
        //서로 관련이 없는 독립 조건이면 `else if` 를 사용하지 않고 `if` 문을 각각 따로 사용해야 한다.
    }
}
