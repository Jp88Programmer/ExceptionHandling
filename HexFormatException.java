package com.example;

public class HexFormatException extends NumberFormatException {
 String hexString ;
 public HexFormatException(){
   this("HexadecimalDecimal is incorrct");
 }
 public HexFormatException(String hexString){
  this.hexString = hexString ;
 }
 @Override
 public String getMessage(){
   return hexString ;
 }
 @Override
 public String toString(){
   return "HexFormatException : " + this.getMessage() ;
 }
 public void printMessage(){
   System.out.println("Incorrect HexadecimalDecimal Number : HexFormatException");
 }
}
