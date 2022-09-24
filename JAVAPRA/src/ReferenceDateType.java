public class ReferenceDateType {

    public static void main(String[] args) {
        int i = 4;

        String str = new String("hello"); //String이라는 클래스 new 생성자
        //new라는 키워드는 객체를 메모리에 올려준다. 이렇게 메모리에 올라간 객체를 인스턴스락고 한다.
        //메모리에 올라간 인스턴스를 가리키는 변수, 참조하는 변수, 레퍼런스 하는 변수가 str이다.
        //참조한다,레퍼런스한다 = 변수가 인스턴스를 가리킨다 (가지고 있는 것이 아님)
        //str이라는 변수에는 메모리의 위치 값이 저장되는 것. 메모리의 위치값이 저장된다고 하더라도 어떤 메모리에 저장되는지 그 정보를 알 수 있는 방법은 없다.
        //그렇기 때문에 str변수는 String 인스턴스를 참조한다고만 알면 된다.

        //앞으로 배울 클래스들은 모두 참조형이다.


    }
}
