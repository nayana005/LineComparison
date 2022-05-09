package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LengthCalculation {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Linecomparision");
	
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter coordinates of x1:  "); 
    int x1= sc.nextInt();
    System.out.print("Enter coordinates of x2:  ");
    int x2= sc.nextInt();
    System.out.print("Enter coordinates of y1: ");
    int y1= sc.nextInt();
    System.out.print("Enter coordinates of y2: ");
    int y2= sc.nextInt();
    double length1=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
    System.out.println("Total Length of line 1 is : " +length1);
    System.out.print("Enter  cordinates of x3:  ");
    int x3= sc.nextInt();
    System.out.print("Enter cordinates of x4:  ");
    int x4= sc.nextInt();
    System.out.print("Enter cordinates of  y3: ");
    int y3= sc.nextInt();
    System.out.print("Enter cordinates of  y4: ");
    int y4= sc.nextInt();
    double length2=Math.sqrt(((x4-x3)*(x4-x3))+((y4-y3)*(y4-y3)));
    System.out.println("Total Length of line 2 is : " +length2);
    if( length1 == length2 ){
        System.out.println("TWO Lines are Equal");
    
}
    else if(length1 > length2){
        System.out.println("Line1 is greater than Line2");
                }
    else
    System.out.println("Line1 is smaller than Line2");
       
}
}
