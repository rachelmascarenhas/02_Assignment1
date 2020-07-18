package com.montran.main;

import com.montran.pojo.Book;
import java.util.*;
public class BookMainV1 {
	public static void main(String[] args) {
			Book book;//reference stored in stack
			book= new Book();
			Scanner sc=new Scanner(System.in);
			System.out.println("To purchase enter book details");
			book.input();
			System.out.println("Purchase Details");
			book.purchase();
	}
}
