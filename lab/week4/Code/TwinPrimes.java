import java.util.*;
public class TwinPrimes {
    static boolean IsPrime(int n){
        if(n==1)   return false;
        int i;
        for(i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    static void primes(int start,int end){
        int i;
        for(i=start;i<end-2;i++){
            if(IsPrime(i) && IsPrime(i+2))
                System.out.print("("+i+","+(i+2)+")"+"::");
                i++;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Range begins at: ");
        a=sc.nextInt();
        System.out.print("Range ends at: ");
        b=sc.nextInt();
        primes(a,b);
      }
}
