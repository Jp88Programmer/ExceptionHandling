package com.example;

public class InvalidRadiusException extends Exception {
 private double radius;
 public InvalidRadiusException(){
   super(" ");
 }
 public InvalidRadiusException(double radius){
   super("Invaild radius " + radius);
   this.radius = radius;
 }
 public InvalidRadiusException(String str){
   super(str);
 }
 public double getRadius(){
   return radius;
 }
}
