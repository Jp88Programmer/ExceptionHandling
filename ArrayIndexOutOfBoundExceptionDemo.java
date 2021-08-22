package com.example;

import com.example.ArrayIndexOutOfBoundExceptionDemo;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class ArrayIndexOutOfBoundExceptionDemo {

  public static void main(String[] args) {
    int[] array = new int[50];
    for(int i = 0 ; i < array.length ; i++){
      int random = new Random(3).nextInt(100);
      array[i] = random ;
    }
    try{
    
    System.out.print("Enter a Search index :   ");
    Scanner scan = new Scanner(System.in);
    int searchIndex = scan.nextInt();
    for(int i = 0 ; i < array.length ; i++){
     if(i == searchIndex)
     {  System.out.println("Serach successfully !! \n Search value is : " + array[searchIndex]); break ;}
    // if (searchIndex >= array.length )
      //throw  new ArrayIndexOutOfBoundsException();  
     }  
    }
    catch (InputMismatchException ex2){
      System.out.println("Your input is incorrect ");
   }
    catch (ArrayIndexOutOfBoundsException ex1){
      System.out.println("Search index is  OutOfBound  of Array");
    }
  }
}
