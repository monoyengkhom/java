import java.util.Scanner;
public class biggest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter three numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.print("The biggest of the three number is: ");
        if(a>b && a>c){
            System.out.print(a);
        }
        else{
            if(b>c){
                System.out.print(b);
            }
            else{
                System.out.print(c);
            }
        }
        System.out.print("\n");
    }
}
