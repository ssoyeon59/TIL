public class StringExam {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello"; //똑같은 같은 인스턴스를 가르킨다. 같은 인스턴트를 참고한다.

        String str3 = new String("hello");
        String str4 = new String("hello");//각각 만든다.

        if (str1 == str2) //문자열 변수를 비교할 때 변수의 레퍼런스를 비교
            System.out.println("str1 과 str2 는 같은 레퍼런스입니다");

        if (str1 == str3)
            System.out.println("str1 과 str3 는 같은 레퍼런스입니다"); //다른 레퍼런스라 값이 나오지 않는다

        if (str3 == str4)
            System.out.println("str3 과 str4 는 같은 레퍼런스입니다"); //다른 레퍼런스라 값이 나오지 않는다

        System.out.println(str1);

        System.out.println(str1.substring(3));//substring는 문자열을 자른 결과를 반환하는 메소드이다. 해당코드가 실행되어도 기존의 코드는 변하지 않는다.

        System.out.println(str1);//불변 클래스 String이 인스턴스가 될 때 가지고 있던 값을 나중에 수정할 수 없다.

        if (str1.equals("hello"));//변수가 저장하는 문자열이 같은지 확인가능
        System.out.println("str1은 hello와 같습니다.");

    }
}
