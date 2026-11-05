package purplebook.chap03;

public class MainSolution_0310 {
    public static void main(String[] args) {
        int val = 1;
        switch(val) {
            case 0:
                System.out.print("X ");
            case 1 | 2:
                System.out.print("Y ");
            case 10:
                System.out.println("Z");
        }
    }
}
