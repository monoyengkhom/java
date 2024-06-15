import java.util.Scanner;
public class gpSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a, r and l");
        int a = sc.nextInt();
        int r = sc.nextInt();
        int l = sc.nextInt();

        int term = a;
        for(int i = 0; i<l; i++){
            System.out.print(term + " ");
            term = term * r;
        }
        sc.close();
    }
}
