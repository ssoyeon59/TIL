public class OperatorExam05 {

    public static void main(String[] args) {

        int b1 = (5 < 4) ? 50: 40; //(조건식) ? 피연산자1 : 피연산자2;
        //()true일 때 피연산자 1의 결과값
        //()false일 때 피연산자 2의 결과값

        System.out.println(b1);

        int b2 = 0;
        if (5 > 4) {
            b2 = 50;
        }else {
            b2 = 40;
        }

        System.out.println(b2);
    }
}
