public class SwitchExam {

    public static void main(String[] args) {
        //switch, case, defalt, break

        int value = 1; //case : 만난 케이스 부터 끝까지 값이 나온다.

        switch (value) {
            case 1 :
                System.out.println("1");
                break; //switch 문에서 빠져나옴
            case 2 :
                System.out.println("2");
                break;
            case 3 :
                System.out.println("3");
                break;
            default:
                System.out.println("그 외 다른 숫자");
        }

        String str = "A";
        switch(str) {
            case "A" :
                System.out.println("A");
            case "B" :
                System.out.println();
        }
    }
}
