public class StringMethodExam {

    public static void main(String[] args) {
        //String str = new String ("hello");
        String str = "hello";
        System.out.println(str.length());
        System.out.println(str.concat(" world"));
        System.out.println(str);// str이 참조한 클래스는 바뀌지 않는다 참조한 부분이 바뀔려면 str.equals을 사용해야 한다
        str = str.concat(" world"); //선언 해줘야한다.
        System.out.println(str);


        System.out.println(str.substring(3));
        System.out.println(str.substring(3, 7));
    }
}
