package com.example;

public class Hex2Dec {
 private String hexString ;
 private boolean verifyHex(){
   for(int i = 0 ; i < hexString.length() ; i++ ){
     if((hexString.charAt(i) < '0' || hexString.charAt(i) > '9' )&&(hexString.charAt(i) < 'A' || hexString.charAt(i) > 'F'))
       return true ;
   }
   return false  ;
 }
 public Hex2Dec(){
   this ("0");
 }
 public Hex2Dec(String hexString) throws HexFormatException {
   this.hexString = hexString ;
    if(this.verifyHex())
     throw new HexFormatException(hexString);
    //catch (HexFormatException ex){
   // System.out.println("Incorrect");
   //}
 }
 public String getHexString(){
   return hexString ;
 }
 public void setHexString(String hexString) throws HexFormatException{
   this.hexString = hexString ;
 }
 public int hex2Dec(){
   int dec = 0;
   for(int i = hexString.length() -1 ,base = 1; i >= 0; i--){
    dec += charDec(hexString.charAt(i)) * base ;
    base = base * 16 ;
   }
   return dec ;
  }
 private int charDec(char hex){
   if(hex >= '0' && hex <= '9')
    return hex - 48 ;
   else{
     switch(hex){
       case 'A' : 
         return 10 ;
       case 'B' : 
         return 11 ;
       case 'C' : 
         return 12 ;
       case 'D' : 
         return 13 ; 
       case 'E' : 
         return 14 ; 
       case 'F' : 
         return 15 ; 
       default : 
         return 16 ; 
     }
   } 
  }
  
 }
