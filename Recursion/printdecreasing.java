import java.io.*;
import java.util.*;

public class printdecreasing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printDecreasing(n); //printDecreasing function invoke
    }
    
    public static void printDecreasing(int n){
        //base case
        if (n == 0) {
            return;
        }
        
        System.out.println(n);
        //recursive function
        printDecreasing(n - 1);
    }   
}