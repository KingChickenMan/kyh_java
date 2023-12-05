package loop;

public class While2_2 {
    public static void main(String[] args) {

//        myCode
//        int sum = 0;
//        int a = 10;
//        int count = 0;
//
//        while (count < 3) {
//            count++;
//            sum = sum + a;
//            System.out.println("sum: " + sum + ", a: " + a);
//            a++;
//        }
        int sum = 0;
        int i = 10;

        sum = sum + i; //sum(0) + i(1) -> sum(1)
        System.out.println("i = " + i + " sum = " + sum);
        i++; // i=2

        sum = sum + i; //sum(1) + i(2) -> sum(3)
        System.out.println("i = " + i + " sum = " + sum);
        i++; // i=3

        sum = sum + i; //sum(3) + i(3) -> sum(6)
        System.out.println("i = " + i + " sum = " + sum);
    }
}
