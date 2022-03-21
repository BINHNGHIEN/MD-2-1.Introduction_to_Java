import java.util.Scanner;
public class BMI_check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Your weight (in kilogram):");
        weight = scanner.nextDouble();

        System.out.print("Your height (in meter):");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);

        if (bmi < 18) {
            System.out.print("Underweight " + bmi );
        } else if (bmi < 25.0) {
            System.out.print("Normal "+ bmi );
         }else if (bmi < 30.0) {
            System.out.print("Overweight " + bmi );
        } else {
            System.out.print("Obese " + bmi );
        }
    }
}


