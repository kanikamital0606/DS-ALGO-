import java.io.*;
import java.util.*;

public class printIncreasingDecreasing {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printincreasingdecreasing(n);
        
    }
    
    
    public static void printincreasingdecreasing(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        printincreasingdecreasing(n - 1);
        System.out.println(n);
    }
    
}