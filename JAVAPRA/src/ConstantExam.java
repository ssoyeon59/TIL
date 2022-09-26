public class ConstantExam {

    public static void main(String[] args) {

        int i;
        i = 10;
        i = 5;

        final int J;//final = 상수를 선언 한다
        J = 10;

//        J = 5; 불가하다

        double circleArea;
        final double PI = 3.14159;
        circleArea = 3 * 3 * PI;

        final int OIL_PRICE = 1350; //바뀌지 않는 값을 선언함 

        int totalPrice = 50 * OIL_PRICE; // OIL_PRICE의 값은 변하지 않고 위의 변수 값만 바뀌면 밑의 모든 OIL_PRICE의 값이 바뀐다.

        System.out.println(J); // 10
        System.out.println(circleArea); // 28.27431
        System.out.println(totalPrice); // 67500


    }
}
