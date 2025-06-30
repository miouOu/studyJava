package mathod.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        while (true) {
            System.out.println("======================================");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("======================================");

            int op = scanner.nextInt();
            if (op == 1) {
                System.out.print("입금액을 입력하세요 : ");
                int deposit = scanner.nextInt();
                balance += deposit;
                System.out.println(deposit + "원을 입금하였습니다. 현재 잔액 : " + balance + "원");
            } else if (op == 2) {
                System.out.print("출금액을 입력하세요 : ");
                int withdraw = scanner.nextInt();
                if (balance >= withdraw) {
                    balance -= withdraw;
                    System.out.println(withdraw + "원을 출금하였습니다. 현재 잔액 : " + balance + "원");
                } else  {
                    System.out.println("출금하려 했으나 잔액이 부족합니다.");
                }
            } else if (op == 3) {
                System.out.println("현재 잔액 : " + balance + "원");
            } else if (op == 4) {

            } else {
                System.out.println("시스템을 종료합니다.");
                break;
            }
        }
    }

}
