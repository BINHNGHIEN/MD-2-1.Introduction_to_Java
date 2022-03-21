import java.util.Scanner;
public class simple_equation {
    public static void main(String[] args) {
        System.out.println("a*x + b = c ");
        Scanner input = new Scanner(System.in);
        System.out.println(" a: ");
        float a = input.nextFloat();

        System.out.println(" b: ");
        float b = input.nextFloat();

        System.out.println(" c: ");
        float c = input.nextFloat();


        if(a !=0){
            float answer = ( c-b)/a;
            System.out.println("Equation pass with x = " + answer);
        } else if(b==c){
            System.out.println("The solution is all x ");
        } else {
            System.out.println("No solution");
        }
    }
}
