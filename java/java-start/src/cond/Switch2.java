package cond;

/*
* switch는 값이 같은 경우만 확인할 수있음. 문자열도 가능.
* 
* switch의 경우 일반 조건문과 다르게 조건을 충족할 경우 바로 그 다음줄부터 break;가 나올 때까지 실행한다는 특징이 존재
* 따라서 만약 해당되는 케이스에 break가 없고, 해당되지 않는 다음 케이스에 break;가 존재한다면
* 그냥 실행하게 되는 것임
*/
public class Switch2 {
    public static void main(String[] args) {
        int grade = 2;
        int coupon;

        switch (grade){
            case 1:
                coupon = 1000;
                break;
            case 2 :
                coupon = 2000;
                break;
            case 3 :
                coupon = 3000;
                break;
            default :
                coupon = 500;
        }
        System.out.println("coupon = " + coupon);
    }
}
