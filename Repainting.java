package PbJavaNovember.src.FirstStepsInCoding.Excercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poly = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int diluteAgent = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
      double sumMaterials = poly * 1.50 + 3 + paint * 14.50 + 0.1 * paint * 14.50 + diluteAgent * 5.00 + 0.40;
      double totalSum = sumMaterials + 0.3 * sumMaterials * hours;

        System.out.println(totalSum);


    }
}
