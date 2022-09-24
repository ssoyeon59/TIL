public class ArrayWithFor {

    public static void main(String[] args) {

        int [] iarray = new int[100];
        iarray[0] = 1;
        iarray[1] = 2;

        System.out.println(iarray.length);

        for (int i = 0; i < iarray.length; i++) {
            iarray[i] = 1 + 1;
        }//i는 for문이 선언됐다가 사라지면 같이 사라진다.

        int sum = 0;
        for (int i = 0; i < iarray.length; i++) {
            sum = iarray[i];
        }

        System.out.println(sum);
    }

}
