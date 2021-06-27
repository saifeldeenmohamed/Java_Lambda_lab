/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambda_lab;

/**
 *
 * @author SaiF El-deen
 */
public class MainClass {
        
    public static void main(String[] args) {

    MyValue myVal = () -> 98.6;
    System.out.println("A constant value: " + myVal.getValue());
    //
    MyParamValue myPval = (double n) -> 1.0 / n;
    System.out.println("Reciprocal of 4 is " + myPval.getValue(4.0));
    System.out.println("Reciprocal of 8 is " + myPval.getValue(8.0));
    //
    NumericTest isFactor = (n, d) -> (n % d) == 0;
    
    if(isFactor.test(5, 3)){
        System.out.println("5 is a factor of 3"); 
    }else{
        System.out.println("5 is not a factor of 3");
    }
    //
    NumericFunc smallestF = (n) -> { 
        int result = 1; 
        // Get absolute value of n. 
        n = n < 0 ? -n : n; 
        for(int i=2; i <= n/i; i++) 
        if((n % i) == 0) { 
        result = i; 
        break; 
    } 
    return result; 
    }; 
    System.out.println("Smallest factor of 12 is " + smallestF.func(12)); 
    System.out.println("Smallest factor of 11 is " + smallestF.func(11)); 
    //
    
    
}
}