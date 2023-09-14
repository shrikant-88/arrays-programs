import java.util.Arrays;
import java.util.Scanner;

public class second_largest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the element of array : ");
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
        System.out.println("second_largest="+arr[n-2]);
    }
}
