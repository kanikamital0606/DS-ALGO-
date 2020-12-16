import java.io.*;
import java.util.*;

public class printincreasing {
  
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        printIncreasing(n); //Invoke function
    }

    public static void printIncreasing(int n) {
        
        if (n == 0) { //base case
            return;
        }

        printIncreasing(n - 1);
        System.out.println(n);
        
    }
}
