public class ArrayExam02 {

    public static void main(String[] args) {
        int[][] array4 = new int[3][4]; //이차원 배열
        array4[0][1] = 10;//첫번째 []는 int 형 배열을 나타내는 부분이라 정수를 넣을 수 없다.

        int[][] array5 = new int [3][1];
        array5[0] = new int [1]; //정수를 하나 담을 수 있는 배열을 생성해서 array5의 0번째 인덱스가 참조한다.
        array5[0][0] = 10; //0번째는 아직 가리키는것이 없다

        int[][] array6 = {{1},{1,2},{1,2,3}};

        System.out.println(array6[0][0]);

        System.out.println(array6[2][2]);
    }
}
