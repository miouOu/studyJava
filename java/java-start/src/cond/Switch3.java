package cond;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 2;
        int coupon;

        switch (grade){
            case 1:
                coupon = 1000;
                break; //break가 없으면 멈추지 않아서 그냥 계속 감
            case 2 :
            case 3 :
                coupon = 3000;
                break;
            default :
                coupon = 500;
        }
        System.out.println("coupon = " + coupon);
    }
}
