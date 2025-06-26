package loop;

/*
* for문에서는 초기식, 조건식, 증감식은 선택 사항이다.
* for (;;)와 같이 모두 생략해도 되지만, 생략은 해도 각 영역을 구분하는 세미콜론(;)은 유지해야 한다.
*/

public class For2 {
    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;

        for (int i = 1; i <= endNum; i++) {
            sum = sum + i;
            System.out.println("i = " + i + " sum = " + sum);
        }
    }
}
