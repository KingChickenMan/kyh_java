package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        int i = 1;
        int max = 50;
        int sum = 0;
        while (i <= max) {
            sum += i;
            System.out.println("i = " + i + ", sum = " + sum);
            i++;
        }
    }
}
