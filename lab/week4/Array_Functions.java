import java.util.*;
public class Array_Functions{ 
    public static void main(String[] args){ 
        int a[] = new int[5]; 
        int b[] = new int[a.length]; 
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.print("\nEnter the number:");
            a[i]=sc.nextInt();
        }
        System.arraycopy(a, 0, b, 0, 5); 
        System.out.println("\nArray a:"); 
        for (int i=0; i<a.length; i++) 
            System.out.print(a[i] + " "); 
  
        System.out.println("\nArray b:"); 
        for (int i=0; i<b.length; i++) 
            System.out.print(b[i] + " "); 
        Arrays.sort(a);
        System.out.print("\nSorting array a yields:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        boolean res=Arrays.equals(a,b);
        System.out.printf("\nThe arrays a and b are %s",res?"equal":"not equal");
        System.out.print("\nEnter the element to be searched for:");
        int key=sc.nextInt();
        int index=Arrays.binarySearch(a,key);
        if(key>0)
            System.out.print("\nElement"+key+"found at index: "+index);
        else 
            System.out.print("\nElement not found");
    } 
}