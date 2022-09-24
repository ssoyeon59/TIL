public class ArrayExam {

    public static void main(String[] args) {
        int[] array1 = new int[100]; //[(숫자)] 숫자만큼 담을 수 있는 index가 생겼다. 메모리를 가지고 있는 것을 가리킨다.

        array1[0] = 50;
        array1[10] = 100;

        int[] array2 = new int[] {1, 2, 3, 4}; //4개를 저장 할 수있는 배열이며, 1, 2, 3, 4가 저장 되어있다.

        int[] array3 = {1, 2, 3, 4};

        System.out.println(array3[3]);

        int value = array3[0]; // 저장 된 값을 꺼내서 사용하는 방법

        System.out.println(value); //1이 나온다.
    }
}
