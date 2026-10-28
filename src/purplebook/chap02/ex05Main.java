package purplebook.chap02;

public class ex05Main {
    public static void main(String[] args) {
        int[][] array;
        array = new int[3][4];
        // int[][] array = new int[3][4];
        array[0][0] = 100;
        array[0][3] = 200;
        System.out.println("array[0][0]の値 : " + array[0][0]);
        System.out.println("array[0][3]の値 : " + array[0][3]);
    }
}
