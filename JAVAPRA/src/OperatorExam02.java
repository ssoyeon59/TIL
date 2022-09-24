public class OperatorExam02 {

    public static void main(String[] args) {

        int i = 10; // 대입연산자
        int j = 10;


        System.out.println(i == j);
        System.out.println(i != j); // 두개의 값이 다른가요?
        System.out.println(i < j);
        System.out.println(i <= j);
        System.out.println(i > j);
        System.out.println(i >= j);

//        i = 10; //단순 대입연산자 //오른쪽 피연산자 값을 왼쪽 피연산자인 변수에다 저장해주세요
        i += 10; // i = i + 10; //복합 대입 연산자 //정해진 연산을 수행한 후 결과 대입

        System.out.println(i);
        System.out.println(i -= 5); //변수 적는데에 바로 적어도 괜찮네?

    }


}
