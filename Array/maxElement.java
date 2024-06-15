import java.util.*;
public class maxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Elements? ");
        int n = sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the values of element "+ (i+1));
            A[i]=sc.nextInt();
        }
        int max = A[0];
        for(int i=1;i<A.length;i++){
            if(A[i]>max){
                max = A[i];
            }
        }
        System.out.println("The max val is : "+ max);
    }
}
