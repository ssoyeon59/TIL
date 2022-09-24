public class VariableScopeExam {

    int globalScope = 10;
    static int staticVal = 7;

    public void scopeTest (int value) {
        int localScope = 20;


        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
    }

    public void scopeTest2 (int value2) {
        System.out.println(globalScope);
//        System.out.println(localScope);
//        System.out.println(value);
        System.out.println(value2);
    }

    public static void main(String[] args) { //class는 인스턴스 하지 않는 이상 사용하지 못한다. static을 사용하면 인스턴스화 하지 않아도 사용할 수 있다.
//        System.out.println(globalScope);
//        System.out.println(localScope);
//        System.out.println(value);
        System.out.println(staticVal);

        VariableScopeExam v1 = new VariableScopeExam();
        System.out.println(v1.globalScope);
        VariableScopeExam v2 = new VariableScopeExam();
        v1.globalScope = 10;
        v2.globalScope = 20;
        System.out.println(v1.globalScope);
        System.out.println(v2.globalScope);
        v1.staticVal = 50;
        v2.staticVal = 100;
        System.out.println(v1.staticVal); //50을 기대했음 값을 저장할 수 있는 공간이 하나밖에 없어서 값을 공유한다
        System.out.println(v2.staticVal);//(래퍼런스, 변수명)사용 보다
        System.out.println(VariableScopeExam.staticVal);//(클래스명.변수명)으로 사용하는 것이바람직하다.
    }
}
