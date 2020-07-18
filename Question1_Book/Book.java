package com.montran.pojo;
import java.util.Scanner;
public class Book {
   private int bookNumber;
   private String bookTitle;
   private double price;
   Scanner sc=new Scanner(System.in);
  
  private double total_cost(int n) {
	  return price*n;
  }
  
  public void input() {
	  System.out.println("Enter Book number");
	  this.bookNumber=sc.nextInt();
	  System.out.println("Enter Book price");
	  this.price=sc.nextDouble();
	  sc.nextLine();
	  System.out.println("Enter Book title");
	  this.bookTitle=sc.nextLine();
	  
  }
  
  public void purchase() {
	  System.out.println("Enter number of copies to be purchased");
	  int n=sc.nextInt();
	  double purchase=total_cost(n);
	  System.out.println("To purchase the book pay Rs."+purchase);
  }
}
