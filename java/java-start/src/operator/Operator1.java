package operator;

public class Operator1 {
    public static void main(String[] args) {
        //변수 초기화
        int a = 5;
        int b = 2;

        //덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum);

        //뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        //곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        //나눗셈
        int div = 5 / 2;
        System.out.println("a / b = " + div); //int 형 계산은 소숫점 표현이 안 됨

        //나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);
    }
}
