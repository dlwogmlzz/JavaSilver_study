package purplebook.chap04;

public class MainSolution_0409 {
    public static void main(String[] args) {
        int[] ary = {10, 20, 30, 40, 50};
        int i = 5;
        for (int a : ary) {
            while (i < ary.length) {
                i++;
                System.out.print(i + " ");
            }
        }
    }
}
