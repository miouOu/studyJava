package mathod;

public class Method1Ref {
    public static void main(String[] args) {
        int sum1 = add(5, 10);
        System.out.println("결과1 출력 : " + sum1);

        System.out.println("=======================");

        //계산2
        int sum2 = add(15, 20);
        System.out.println("결과1 출력 : " + sum2);

        System.out.println("=======================");
    }

    //add 메서드
    public static int add(int a, int b) {
        System.out.println(a + " + " + b + " 연산 수행");
        int sum = a + b;
        return (sum);
    }
}
