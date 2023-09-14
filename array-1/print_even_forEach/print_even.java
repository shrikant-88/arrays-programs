import java.util.Scanner;

/**
 * print_even
 */
public class print_even {

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
        // traversing an array using foreach loop------------------------

        for (int i : arr) {
           if(i%2==0){
             System.out.println(i);
           }
        }
    }
}