package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택: ");

            int amount = 0;
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("입금액을 입력하세요: ");
                amount = scanner.nextInt();
                balance += amount;
                System.out.print(amount + "원을 입금하였습니다. ");
                System.out.println("현재 잔액: " + balance);
            } else if (choice == 2) {
                System.out.print("출금액을 입력하세요: ");
                amount = scanner.nextInt();

                if (balance < amount) {
                    System.out.println(amount+ "원을 출금하려 했으나 잔액이 부족합니다.");
                } else if (balance >= amount) {
                    System.out.println(amount + "을 출금하였습니다");
                    balance -= amount;
                    System.out.println("현재 잔액: " + balance + "원");
                }
            } else if (choice == 3) {
                System.out.println("현재 잔액: " + balance+ "원");
            } else {
                System.out.println("시스템을 종료합니다.");
                break;
            }
        }
    }
}
