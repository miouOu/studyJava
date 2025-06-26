package cond;

/*
* else if와 if가 다른 점은
* if는 특정 조건을 만족해도 모든 조건문을 필히 검사해야 하고,
* else if는 특정 조건을 만족하면 그 이후의 조건문은 검사하지 않아도 되는 특징을 가지고 있다.
*/
public class If3 {
    public static void main(String[] args) {
        int age = 20;

        if (age <= 7){
            System.out.println("미취학");
        }
        else if (age >= 8 && age <= 13){
            System.out.println("초등학생");
        }
        else if (age >= 14 && age <= 16){
            System.out.println("중학생");
        }
        else if (age >= 17 && age <= 19){
            System.out.println("고등학생");
        }
        else if (age >= 20){
            System.out.println("성인");
        }
    }
}
