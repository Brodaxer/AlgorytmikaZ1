import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int a ;
        do {
            System.out.println("Podaj liczbe calkowita");
            a = sc.nextInt();
            if (a <= 100){
                suma = suma + a;
            }

        }while (a<=100);
        if (suma%2==0){
            System.out.println("Suma liczb jest parzysta");
        }else System.out.println("Suma liczb jest nieparzysta");
        System.out.println(suma);
    }
}