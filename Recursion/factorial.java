import java.io.*;
import java.util.*;

public class factorial{
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int func = printFactorial(n);  
        System.out.println(func);      
    }

    public static int printFactorial(int n){
        if(n==0 || n==1){
            return 1;
        }

        int func1 = printFactorial(n-1);
        int ans = n * func1;
        return ans;
    }
}