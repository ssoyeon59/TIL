public class MyClass {
//    public 리턴타입 메소드명 (매개변수들) {구현}
    public void method1() {//void 리턴 타입이 없다 할때 선언
        System.out.println("m1이 실행됨..");
    }

    public void method2(int x) {
        System.out.println(x + "를 이용한 m2 실험"); //결과값을 받지 못한다.
    }

    public int method3() { //리턴 값이 있음
        System.out.println("m3 실행");
        return 10; //리턴 기억
    }

    public void method4(int x, int y) {
        System.out.println(x + y + "method4실행");
    }

    public int method5(int y) {
        System.out.println(y + "이용한 m5 실행");

        return y * 2;
    }
}
