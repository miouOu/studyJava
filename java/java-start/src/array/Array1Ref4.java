package array;

public class Array1Ref4 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50}; //이렇게 사용할 때는 나눠서 사용 못함
        //int[] students;
        //students = {90, 80, 70, 60, 50}; //이런식으로 사용 못함 -> stuents가 int형인지 모르기 때문에

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수 = " + students[i]);
        }
    }
}
