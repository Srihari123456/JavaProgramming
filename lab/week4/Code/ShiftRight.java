import java.util.*;
public class ShiftRight{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value by which the elements must be shifted: ");
        int k = sc.nextInt();
        System.out.println("Enter the no of elements:");
        int n = sc.nextInt();
        int []arr = new int[n];
        int i;
        System.out.print("Enter the values:");
        for(i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int []shiftedArray = shiftRight(arr,k);
        System.out.println("Shifted Array is: ");
        for(int x:shiftedArray)System.out.print(x+" ");
    }
    public static int[] shiftRight(int []a, int k){
    	int length = a.length;
        for(int i=0;i<k;i++){
            int temp = a[length-1];
            for(int j=length-1;j>0;j--){
                a[j]=a[j-1];
            }
            a[0]=temp;
        }
        return a;
    }
}
