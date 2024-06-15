import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        String option;
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the operation you want: ");
        option = sc.nextLine();
        option = option.toUpperCase();
        switch (option) {
            case "ADD":
             System.out.println(a+b);
             break;
            case "SUB":
             System.out.println(a-b);
             break;
            case "MUL":
             System.out.println(a*b);
             break;
            case "DIV":
             System.out.println(a/b);
             break;
            default:
             System.out.println("Invalid Operation");
             break;
        }
    }
}
