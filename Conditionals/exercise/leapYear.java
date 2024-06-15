import java.util.Scanner;
public class leapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int yr;
        System.out.println("Enter a year: ");
        yr=sc.nextInt();

        if(yr%4==0){
            if(yr%100==0){
                if(yr%400==0){
                    System.out.println("It is a leap year.");
                }
                else{
                    System.out.println("It is not a leap year.");
                }
            }
            else{
                System.out.println("It is not a leap year.");
            }
        }
        else{
            System.out.println("It is not a leap year.");
        }
    }
}