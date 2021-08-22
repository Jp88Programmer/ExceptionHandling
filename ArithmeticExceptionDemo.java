package example;

import java.util.Scanner;

/* The exception is an object created from an exception class. In this case, the exception class is 
java.lang.ArithmeticException.
 */
/* When an exception is thrown, the normal execution flow is interrupted. As the name sug-
gests, to “throw an exception” is to pass the exception from one place to another
 */
public class ArithmeticExceptionDemo {
 public static void main(String args[]){
   Scanner scan = new Scanner(System.in);
   System.out.print("Enter a two numbers : ");
   int number1 = scan.nextInt();
   int number2 = scan.nextInt();
  /* The try block  contains the code that is executed in normal circumstance
   */
   try {
     divided(number1,number2);
    System.out.println("Divided successfully");
     }
  /* The exception is 
caught by the catch block. The code in the catch block is executed to handle the exception.
   */
     catch(ArithmeticException ex){
     /* The identifier ex in the catch–block header
      */
       System.out.println("Exception :: ArithmeticException generated ");
     }
     
 }
 public static void divided(int number1,int number2) throws ArithmeticException {
   if(number2 == 0)
    /* The value thrown, in this case new ArithmeticException("Division not applicable Exception generated");
is called an exception. 
     */
    /* The constructor ArithmeticException(str) is 
invoked to construct an exception object, where str is a message that describes the exception.
     */
    throw new ArithmeticException("Division not applicable Exception generated");
    /* The execution of a throw statement is called throwing an exception.
     */
    System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
 }
}
/* Program description or Exception explain */
/* The throw statement is analogous to a method call, but instead of calling a method, it calls 
a catch block. In this sense, a catch block is like a method definition with a parameter that 
matches the type of the value being thrown. Unlike a method, however, after the catch block 
is executed, the program control does not return to the throw statement; instead, it executes 
the next statement after the catch block.
 */
/*
  acts very much like a parameter in a method. Thus, this parameter is referred to as a 
catch–block parameter. The type (e.g., ArithmeticException) preceding ex specifies 
what kind of exception the catch block can catch. Once the exception is caught, you can 
access the thrown value from this parameter in the body of a catch block.
In summary, a template for a try-throw-catch block may look like this:
 */
/* 
 * try {
 * Code to run;
   A statement or a method that may throw an           exception;
   More code to run;
   }
 * catch (type ex) {
   Code to process the exception;
   }
 */