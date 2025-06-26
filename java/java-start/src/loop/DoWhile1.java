package loop;

/*
* 무조건 한 번은 출력해야 할 때 쓰는 반복문
*/
public class DoWhile1 {
    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.println("현재 숫자는 : " + i);
            i++;
        } while (i < 3);
    }
}
