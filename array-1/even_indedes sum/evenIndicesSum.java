import java.util.Scanner;

public class evenIndicesSum {

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
        int sum = 0;
        //assuming even indexes - 0,2,4,6...
        for(int i = 0;i<n;i+=2){
            sum +=arr[i];
        }

        System.out.println("sum = "+sum);
    }
}
