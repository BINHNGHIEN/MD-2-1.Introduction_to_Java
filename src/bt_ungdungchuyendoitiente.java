import java.util.Scanner;
public class bt_ungdungchuyendoitiente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float USD;
        float VND;
        Scanner input = new Scanner(System.in);
        System.out.print("Which money you want to change (1:from USD to VND) (2: from VND to USD)");
        int change = input.nextInt();
        switch(change){
            case 1:
                System.out.println("Enter your money( USD)");
                USD = scanner.nextFloat();
                float vnd = USD * 23000;
                System.out.println("VND is: " + vnd);
                break;
            case 2:
                System.out.println("Enter your money( VND)");
                VND = scanner.nextFloat();
                float usd = VND/23000;
                System.out.println("VND is: " + usd);
        }
    }
}
