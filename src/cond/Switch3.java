package cond;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                //case 2` 에는 `break` 문이 없다. 그러면 중단하지 않고 바로 다음에 있는 `case 3` 의 코드를 실행한다.
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
                break;

        }

        System.out.println("발급 받은 쿠폰 " + coupon);

    }
}
