public class WhileExam {

    public static void main(String[] args) {

//        int i = 0;
//
//        while(i < 10) {
//            System.out.println(i);
//            i++; //i = i+1; //조건문을 원하는 만큼만 반복하고 빠져나가기 위한 부분
//        }

        int total = 0; //i 값을 누적할 변수 선언
        int i =  1;

        while (i <= 100) {
            total = total + i;
            i++;
        }

        System.out.println(total);

        while (true) {//계속 무한 루프가 발생한다
            System.out.println("hello");
            //break;을 작성하면 빠져나올 수 있다.
        }
    }
}
