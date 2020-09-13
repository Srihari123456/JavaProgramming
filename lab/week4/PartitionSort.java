import java.util.*;
public class PartitionSort {
    static int[] partition(int arr[]){
        int pivot = arr[0];
        int i = -1; // index of smaller element
        for (int j=0; j< arr.length; j++){
            if (arr[j] < pivot){
                i++;
                arr[i] = arr[i] + arr[j];
                arr[j] = arr[i] - arr[j];
                arr[i] = arr[i] - arr[j];
            }
        }
        
        return arr;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans[] = partition(arr);
        System.out.println("After the partition sort:");
        for(int i =0 ;i< ans.length;i++) {
            System.out.print(ans[i]+" ");
        }
	}

}
