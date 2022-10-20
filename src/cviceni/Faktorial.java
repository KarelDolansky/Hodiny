package cviceni;

import java.util.Scanner;

public class Faktorial {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Cislo: ");
        int n = sc.nextInt();
        long fak = 1;
        while (n > 1) {
            fak = fak * n;
            --n;
        }
        System.out.println(fak);
    }

}
