package mathod.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        repeatMsg(3, "Hello, World!");
    }
    public static void repeatMsg(int n, String message) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
}
