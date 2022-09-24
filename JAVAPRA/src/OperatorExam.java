public class OperatorExam {

    public static void main(String[] args) {

        //부호 연산자
        int i1 = -5;
        int i2 = +i1;
        int i3 = -i1;

        System.out.println(i1);
        System.out.println(i2); //-5가 나온다 변수 앞에 + 가 있다면 부호비트는 그대로 가져오고
        // - 가 부호비트를 반대로 바꾼다.

        System.out.println(i3); // 5 가 나온다

        //증감 연산자
        int i4 = ++i3; // i3 = i3+1;
        System.out.println(i4);
        System.out.println(i3); // ++가 i3 앞에 붙여졌기 때문에 먼저 더해지고 i3=6이 된다.

        int i5 = i3++; //i3 = i3 + 1;
        System.out.println(i5); //7을 예상했지만 6 ++ 먼저 값을 대입 시킨다 그런다음에 i3 = i3 + 1; 이 된다.
        System.out.println(i3); //따라서 i3 = 7 이 된다.

        int i6 = --i3; //i3 = i3 -1
        System.out.println(i6); //6 먼저 뺴고 i6의 값이 나오니깐 6
        System.out.println(i3); //6 i3 -1

        int i7 = i3--;
        System.out.println(i7);// 5가 나올거라고 예상했지나 6 왜냐하면 먼저 값을 내고 i3은 -1이 된 것이다
        System.out.println(i3);// i3 = i3 - 1 이 되었기 때문에 5

        //이항 연산자
        int i = 5;
        int j = 2;

        System.out.println(i + j);
        System.out.println(i - j);
        System.out.println(i * j);
        System.out.println(i / j); //2.5가 아니라 2 가 나온다 정수끼리의 연산은 정수끼리 답이 나온다.
        System.out.println(i / (double) j);//j를 실수로 바꾸고 나면 2.5를 얻는다
        System.out.println(i % j); //나머지 값
    }
}
