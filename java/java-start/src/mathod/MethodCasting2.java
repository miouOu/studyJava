package mathod;

//메서드 시그니처 = 메서드 이름 + 매개변수 타입 (순서)
public class MethodCasting2 {
    public static void main(String[] args) {
        int number = 100;
        number = (int) printNumber(number);
    }

    public static double printNumber(double n) { //double이 더 큰 숫자 범위이므로 자동 형변환 적용
        System.out.println("숫자 : " + n);

        return n;
    }
}
