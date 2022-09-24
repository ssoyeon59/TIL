import java.util.Scanner;

public class DoWhileExam {

    public static void main(String[] args) {

        int value = 0; //변수 선언
        Scanner scan = new Scanner (System.in); //자바가 이미 만들어놓은 클래스
        // system.in이 키보드

        do {
            //반복할 문장들을 적는다
            value = scan.nextInt();
            System.out.println("입력받은 값:" +value);

        }  while(value != 10);

        System.out.println("반복은 종료!!");
    }
}
