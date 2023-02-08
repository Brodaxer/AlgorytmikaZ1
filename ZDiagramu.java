import java.util.Scanner;

public class ZDiagramu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multi = 1;
        for (int index = 0; index < 5; index++) {
            int next = sc.nextInt();
            multi = multi * next;
        }
        if (multi >= 0) {
            System.out.println("nieujemna ");
        } else System.out.println("ujemna");
    }
}
