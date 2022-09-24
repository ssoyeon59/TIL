public class OperatorExam03 {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = 15;

        System.out.println(a - b * c);
        System.out.println((a - b) * c);//연산자 우선순위

        System.out.println(a > 5 && b > 5);//&&: 논리 연산자 양쪽이 모두 ture만 ture

//        System.out.println(++a - 5); //1이 출력됨
        System.out.println(a++ -5); // 0이 출력 됨(위의 값을 없애면) 있으면 1이 됨(이미 증가한 a값이라서)
        // 증가하기 전에 출력됨 하지만 a = 6이 출력될 것이다.!!!!기억해두기!!!!

        System.out.println(a);


    }
}
