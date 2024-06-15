import java.util.Scanner;
public class apSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to print AP Series");
        System.out.println("Enter a , d and l");
        int a = sc.nextInt();
        int d = sc.nextInt();
        int l = sc.nextInt();
        int term = a;
        for(int i=0; i<l; i++){
            System.out.print(term + ", ");
            term = term + d;
        }
        System.out.print("\n");
        sc.close();
    }
}
