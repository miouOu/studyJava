package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int productCount = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요 : ");
            int menu = scanner.nextInt();
            if (menu == 1) {
                System.out.print("상품 이름을 입력하세요 : ");
                productNames[i] = scanner.nextLine();
                System.out.print("상품 가격을 입력하세요 : ");
                productPrices[i] = scanner.nextInt();
            } else if (menu == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    break;
                }
                for (int j = 0; j < productCount; j++) {
                    System.out.println(productNames[j] + ": " + productPrices[j] + "원");
                }
            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
