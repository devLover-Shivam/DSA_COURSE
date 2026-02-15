import java.util.*;
public class pattern {
    public static void print1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void print2(int n){
        for(int i=1;i<=n;i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void print3(int n){
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");

            }
            System.out.println();
        }
    }

    public static void print4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
    public static void print5(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void print6(int n){
        for(int i=1;i<=n;i++){
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void print7(int n){
        
        for (int i = 0; i < n; i++) {
            //spaces
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }

            //spaces
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            System.out.println();

        }
    }

    public static void print8(int n){
        for (int i = 0; i < n; i++) {
            //spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 0; j < 2*n - (2*i+1); j++) {
                System.out.print("*");
            }

            //spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print8(n);
    }
}
