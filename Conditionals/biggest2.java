import java.util.Scanner;
public class biggest2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        if(a>b && a>c){
            System.out.print(a);
        }
        else if(b>c){
            System.out.print(b);
        }
        else{
            System.out.print(c);
        }
        System.out.printf("\n");
    }
}
