public class TypeCastingExam {

    public static void main(String[] args) {

        int x = 50000;
        long y = x;
        //x가 형 변환이 일어났다
        long x2 = 5;
//        int y2 = int x2; //에러가 났다. 큰그릇에 있지만 작은 그릇에 작은 숫자라면 담을 수 있다.
        // 그러나 프로그램에선 확답을 내려 줄 수 가 없어서 에러가 난다.
        int y2 = (int) x2; //강제 형변환 (형식적 형변환)
    }
}
