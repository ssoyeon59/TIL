public class EnumExam {

    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";

    public static void main(String[] args) {

        String gender1;
        gender1 = EnumExam.MALE;
        gender1 = EnumExam.FEMALE;

        gender1 = "boy"; // 저장 할 수 있다.

        Gender gender2; // 선언
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;

//        gender2 = "boy"; //다른 값은 저장 할 수 없다
    }
}
enum Gender { //특정 단어만 가지고 싶을 때 열거를 하면 된다.
    MALE, FEMALE; //열거 시켜준다.
}