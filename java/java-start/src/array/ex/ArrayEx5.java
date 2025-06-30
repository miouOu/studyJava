package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[3];

        System.out.println("5개의 정수를 입력하세요 : ");
        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextInt();
        }
        int minNumber;
        int maxNumber;
        int temp;

        minNumber = maxNumber = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] < minNumber) {
                minNumber = number[i];
            }
            if (number[i] > maxNumber) {
                maxNumber = number[i];
            }
        }
        System.out.println("가장 작은 정수 : " + minNumber);
        System.out.println("가장 큰 정수 : " + maxNumber);
    }
}
