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
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Max element of the array is: "+max);
    };
    
    public static void reverseArray(int arr[]){
        int sp = 0;
        int ep = arr.length -1;

        while(sp<ep){
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;

            sp++;
            ep--;
        }
        System.out.print("Reversed array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
    //Reversing Sub Array

    public static void reverseSubArray(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting index to be reversed : ");
        int s = sc.nextInt();

        System.out.println("Enter the ending index to be reversed : ");
        int e = sc.nextInt();

        int sp = s;
        int ep =e;

        while(sp<ep){
            int temp =arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }

        System.out.print("Reversed Sub array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void revArray(int arr[],int sp, int ep){

        while(sp<ep){
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;

            sp++;
            ep--;
        }
        
    }

    // FUNCTION TO FIND TOTAL NUMBER OF ELEMENTS FOR WHICH ONE GREATER ELEMENT EXIST.

    public static int countGreater(int arr[]){
        int max = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
            
        }

        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==max){
                count++;
            }
        }

        return (arr.length - count);
        
    }

    //TWO SUM PROBLEM
    public static boolean twoSum (int arr[],int k){
        for (int i = 0; i < arr.length - 2; i++) {
            for(int j = 0 ; j<arr.length;j++){
                if(arr[i]+arr[j] == k) return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        //taking array input
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }


        //CALLING CONSECUTIVE REVERSE FUNCTIONS FOR ROTATION.
        /* int k = sc.nextInt();
        revArray(arr, 0, n-1);
        revArray(arr, 0, k-1);
        revArray(arr, k, n-1);
        System.out.print("Rotated Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        } */
        
        /* int ans = countGreater(arr);
        System.out.println("Total numbers of elements for which one greater element exist: "+ans); */
        System.out.print("Finding the sum:");
        int k = sc.nextInt();
        boolean ans = twoSum(arr, k);
        System.out.println("Is there any pair that equals to the sum of:"+k+"+ ?" + ans);


    }
}
