package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào phương trình bậc 2 (Ax2 + Bx + C = 0):");
        System.out.print("Enter A: ");
        double a = scanner.nextDouble();

        System.out.print("Enter B: ");
        double b = scanner.nextDouble();

        System.out.print("Enter C: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if(quadraticEquation.getDiscriminant() >= 0){
            if(quadraticEquation.getDiscriminant() == 0){
                System.out.println("The equation has two roots " + quadraticEquation.getRoot());
            }else{
                System.out.println("The equation has two roots " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
            }
        }else{
            System.out.println("The equation has no roots.");
        }
    }
}
