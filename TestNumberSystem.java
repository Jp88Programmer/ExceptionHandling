package com.example;

import com.example.Hex2Dec;
import com.example.HexFormatException;


public class TestNumberSystem {
 public static void main(String[] args){
  try{
   Hex2Dec h1 = new Hex2Dec("F6ty");
   System.out.println(h1.hex2Dec()); 
   }
   catch (HexFormatException ex){
   ex.printMessage();
   System.out.println(ex);
   }
 }
}
