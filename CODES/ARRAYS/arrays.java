import java.util.Scanner;

public class arrays {
    public static void sumArray(int arr[]){
        int sum = 0;
        for(int i =0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.print("Sum of the given array is : "+sum);
    }
    public static void maxElement(int arr[]){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Max element of the array is: "+max);
    };
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        //taking array input
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        maxElement(arr);

        
    }
}
