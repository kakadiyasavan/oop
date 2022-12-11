import java.util.Scanner;

public class mxmini {

    public static void main(String[] args) {

        int a[] = {10, 63 };

        int b[] = { 10,63 };

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= b[i]) {
                System.out.println("Maximum value is : " + a[i]);
                a[i] = b[i];
            } else if (b[i] <= a[i]) {
                System.out.println("Minimum value is : " + b[i]);
                b[i] = a[i];
            }

        }

    }
}
