/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cviceni;

import java.util.Scanner;

/**
 *
 * @author Karel
 */
public class DveRovnice {

    public static final double EPS = 1E-7;
    private static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Zadejte 6 číslic pro vytvoření a vyřešení dvojice rovnic");
        double a1 = sc.nextDouble();
        double b1 = sc.nextDouble();
        double c1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        double b2 = sc.nextDouble();
        double c2 = sc.nextDouble();

        double x, y;
        double det = a1 * b2 - a2 * b1;
        System.out.format("Dvojice je ve tvaru%n %fx+%fy=%f %n %fx+%fy=%f%n", a1, b1, c1, a2, b2, c2);

        x = (b2 * c1 - b1 * c2) / det;
        y = (a1 * c2 - a2 * c1) / det;
        if (Double.isFinite(x) && Double.isFinite(y)) {
            System.out.println("Je řešení");
            System.out.println(x + " " + y);
        } else {
            System.out.println("Nemá jednoznačné řešení");
        }

    }

}
