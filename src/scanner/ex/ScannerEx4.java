package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("구구단의 단 수를 입력해주세요: ");
        int n = scanner.nextInt();
        System.out.print(n + "단의 구구단: ");
        for (int m=1; m < 10; m++) {
            System.out.println(n + " x " + m + " = " + n * m);
        }
    }
}
