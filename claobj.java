import java.util.Scanner;

public class claobj {

    public static void main(String[] args) {
        
        int i ;
        int fact = 1;
        int b;

        Scanner th = new Scanner(System.in);
        System.out.println("Enter the value : ");
        b = th.nextInt();
        
        for (i = 1; i <= b; i++) {
            fact=fact*i;
        }

        System.out.println("factorial "+b+" : "+fact);
    }
}

