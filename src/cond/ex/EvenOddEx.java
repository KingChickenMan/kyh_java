package cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {

        int x = 3;
/*
        switch (x%2) {
            case 0:
                System.out.println("x = " + x + ", 짝수");
                break;
            case 1:
                System.out.println("x = " + x + ", 홀수");
                break;
        }
 */
        String res = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + res);

    }
}
