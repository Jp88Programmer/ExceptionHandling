package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;


public class TestInputMismatchException {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    try {
    System.out.println("Enter a two number : ");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();   
    System.out.println(num1 + " + " + num2 + "  = " + (num1 + num2));
    }
    catch (InputMismatchException ex){
      System.out.println("Your input is incorrect ");
    ex.printStackTrace();
    }
  }

}
    