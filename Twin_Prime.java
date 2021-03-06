package Russi7kd;
import java.util.*;
public class Twin_Prime {
    public static void main(String[] args) {
        final int TOTAL_TWIN_PRIME = 1_000; // Constant Variable
        //Caller Loop
        for (int i = 2; i < TOTAL_TWIN_PRIME; i++)
            twinPrime(i);//Actual parameters
    }
    //TwinPrime Method for verfication of two consecutive Twin primes
    public static void twinPrime(int i){
        boolean isPrimeNumberFirst = isPrime(i); // Checking first prime number
        //If first number is prime then the second must also be prime to validate TWIN_PRIME
        if (isPrimeNumberFirst == true  && (i+2  <  1_000) ){
            boolean isPrimeNumberSecond = isPrime(i+2); // Checking second Prime number
            if (isPrimeNumberFirst && isPrimeNumberSecond) //Displaying results
                System.out.println("Twin Prime ("+(i)+","+(i+2)+")");
        }
        return;
    }
    public static boolean isPrime(int n){ // This method is used for prime number verification
        int divisor = 2; //Divisor starts from 2
        while (divisor < n ){ // Loop for prime verification
            if(n % divisor ==0)
                return false;
            divisor ++;
        }
        return true;
    }
}
