package mathod;

public class MothodReturn2 {
    public static void main(String[] args) {
        checkAge(22);
    }
    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "살, 미성년자는 출입이 불가능합니다.");
            return;
        } else {
            System.out.println("성인입니다.");
        }
    }
}
