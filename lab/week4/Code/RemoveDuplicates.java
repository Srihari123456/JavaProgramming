import java.util.*;
public class RemoveDuplicates{
    public static int[] removeDuplicate(int arr[]){
        int n = arr.length;
    	if (n==0 || n==1){
            return arr;
        }
        int j = 1;
        Arrays.sort(arr);
        for (int i=1; i<n; i++){
            if (arr[i] != arr[i-1]){
                j++;
            }
        }
        int[] temp=new int[j];
        j=0;
        temp[0] = arr[0];
        j++;
        for(int i=1;i<n;++i){
            if(arr[i] != arr[i-1])
            {
                temp[j++]=arr[i];
            }
        }
        return temp;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for (int i=0; i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int[] temp;
        temp = removeDuplicate(arr);
        System.out.println("The array elements are:");
        for(int x:temp)System.out.print(x+" ");
    }
}
