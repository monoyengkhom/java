import java.util.*;
public class secondmaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max1;
        int max2;
        System.out.print("How many elements: ");
        int n = scanner.nextInt();
        int A[] = new int[n];
        for(int i=0;i<A.length;i++){
            System.out.print("Element "+i+" = ");
            A[i] = scanner.nextInt();
        }
        max1 = A[0];
        max2 = A[0];
        for(int i=1;i<A.length;i++){
            if(A[i]>max1){
                max2 = max1;
                max1 = A[i];
            }
            else{
                if(A[i]>max2){
                    max2=A[i];
                }
            }
        }
        System.out.println("The second largest element is "+max2);
        scanner.close();
    }
}
