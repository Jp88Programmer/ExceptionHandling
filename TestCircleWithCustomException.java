package com.example;

import com.example.CircleWithException;


public class TestCircleWithCustomException {
 public static void main(String args[]){
 try {
   CircleWithException cir1 = new CircleWithException(2);
   CircleWithException cir2 = new CircleWithException(-3);
   CircleWithException cir3 = new CircleWithException(-6);
   cir2.setRadius(-5);
   System.out.println("Radius intialize in circles");
   }
  catch (InvalidRadiusException ex){
    System.out.println(ex);
  }
  System.out.println(CircleWithException.getNumberOfObject());
 }
}
class CircleWithException{
 private double radius;
  /** this static member its made when first object create and than its not create further when another object create */
  /** that is call also class member or variable */
  private static int numberOfObject = 0;
  /**default constructor*/
 public CircleWithException() throws InvalidRadiusException{
    this(1);
    numberOfObject++;
  }
  /**make parameters construtre*/
  public CircleWithException(double newRadius) throws 
  InvalidRadiusException{
     if(radius >= 0){
     this.radius = newRadius;
     numberOfObject++;
     }
    else
     throw new InvalidRadiusException(radius);   
  }
  public void setRadius(double radius) throws
InvalidRadiusException{
    if(radius >= 0)
     this.radius = radius;
    else
     throw new InvalidRadiusException(radius);
  }
  public static int getNumberOfObject(){
    return numberOfObject;
  }
  public double getRadius(){
    return radius;
  }
  public String toString(){
    return "Circle : " + this.radius ;
  }
}