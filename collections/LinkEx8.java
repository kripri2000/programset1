package collections;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data,elt;
		// TODO Auto-generated method stub
		LinkedList<Integer> lst = new LinkedList<Integer>();
		System.out.println("Enter the elements : ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			data = sc.nextInt();
			lst.add(data);
		}
		System.out.println("Enter the element to be searched : ");
		elt = sc.nextInt();
		System.out.println("First occurrence at : "+lst.indexOf(elt));
		System.out.println("Second occurrence at : "+lst.lastIndexOf(elt));

	}}
