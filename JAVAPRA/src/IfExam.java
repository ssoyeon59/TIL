public class IfExam {

    public static void main(String[] args) {

        int x = 50;
        int y = 60;
//        int y = 50;

//        if(x > y) { //y=60; 값이 맞지 않아 아무것도 안나온다
//        if (x < y) {
//            System.out.println("x는 y보다 작습니다.");
//            System.out.println("test");
//
//        }
//
//        if (x < y) //{}가 없다면 단 한줄만이 if의 영향을 받는다.
//            System.out.println("x는 y와 같습니다.");
//        System.out.println("test");

        if (x == y) {
            System.out.println("x와 y는 같습니다..");
        } else if (x < y){//몇개든지 붙여서 사용이 가능하다 하지만 가능한 적게 쓰는게 좋음.
            System.out.println("x와 y보다 작습니다.");
        } else {
            System.out.println("x는 y와 다릅니다.");
        }
    }
}
