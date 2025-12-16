import java.util.Scanner;

public class GetInput {
    public static void main(String[] args) {
        System.out.println("Getting user input in java");
        Scanner s = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter two numbers: ");
        a = s.nextInt();
        b = s.nextInt();
        c = a + b;
        System.out.printf("Sum for %d and %d is: %d", a, b, c);

    }
}
