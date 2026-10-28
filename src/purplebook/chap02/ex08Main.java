package purplebook.chap02;

// 配列の宣言と初期化
public class ex08Main {
    public static void main(String[] args) {
        int[][] a1 = new int[2][];          // OK
        //int[][] a2 = new int[][2];          // コンパイルエラー
        //int[][] a3 = new int[2]{};          // コンパイルエラー
        //int[][] a4 = new int[2]{10, 20};    // コンパイルエラー
        int[] a5 = new int[]{10, 20};       // OK
        int[] a6 = { };                     // OK
        int[][] a7 = { };                   // OK
        int[][] a8 = new int[][]{ };        // OK
        //var a9 = {10, 20};                  //　コンパイルエラー
        var a10 = new int[]{10, 20};        // OK

    }
}
