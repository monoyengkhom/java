public class reverseOverloading {
    static int reverse(int n){
        int rev = 0;
        while (n>0){
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10; 
        }
        return rev;
    }
    static int [] reverse(int A[]){
        int B[] = new int[A.length];
        for(int i=A.length-1,j=0;i>=0;i--,j++){
            B[j]=A[i];   
        }
        return B;
    }
    public static void main(String[] args) {
        int C = reverse(25);
        System.out.println(C);
        int A[]={3,2,4,9,5};
        int D[] = reverse(A);
        for(int x:D){
            System.out.print(x+" ");
        }
    }
}
