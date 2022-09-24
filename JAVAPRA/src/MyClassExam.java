public class MyClassExam {

    public static void main(String[] args) {
        MyClass myclass = new MyClass();
        myclass.method1();
        myclass.method2(10);
        int value = myclass.method3();//리턴할 값이 있다면 받아낼 변수가 필요하다.
        System.out.println("m3이 리턴한 값 " + value);
        myclass.method4(5, 10);
        int value2 = myclass.method5(55);
        System.out.println("m5가 리턴한 값: " + value2);
    }
}
