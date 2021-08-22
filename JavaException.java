package com.example;

public class JavaException {

  public static void main(String[] args) {
   
    try{
      
      System.out.println(sumElements(new int[] {2,3,4,1,2,5,6,3}));
      }
      catch (Exception ex){
      //System.out.println("Out of the Range \nYou are cross the Border !!!!! \n Fu****k");
       ex.printStackTrace();
   System.out.println("\n" + ex.getMessage());
  /* Returns the message that describes this exception object.
   */
   System.out.println("\n" + ex.toString());
  /* Returns the concatenation of three strings: (1) the full name of the exception
class; (2) ":" (a colon and a space); (3) the getMessage() method.
   */
   System.out.println("\nTrace Info Obtained from getStackTrace");
   StackTraceElement[] traceElements = ex.getStackTrace();
  /* Returns an array of stack trace elements representing the stack trace
pertaining to this exception object.
   */
   for (int i = 0; i < traceElements.length; i++) {
   System.out.print("method " + traceElements[i].getMethodName());
   System.out.print("(" + traceElements[i].getClassName() + ":");
   System.out.println(traceElements[i].getLineNumber() + ")");
      }
    }
  }

private static  int sumElements(int[] list) throws Exception {
   int sum = 0;
   int i = 0;
  for(i = 0 ; i <= list.length ; i++)
    sum += list[i];
   
  /*if(i >= list.length)
   *throw new ArrayIndexOutOfBoundsException("Out Of the range the Array length ") ;*/
   return sum ;
 }
}
