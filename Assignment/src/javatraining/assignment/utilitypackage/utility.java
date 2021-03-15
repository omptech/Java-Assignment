package javatraining.assignment.utilitypackage;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javatraining.assignment.inputpackage.InputAcceptor;
import javatraining.assignment.itemtypepackage.Item;
import javatraining.assignment.resultpackage.Result;


public class utility {

	public static void main(String[] args) throws IOException {
		ArrayList<Item> list = new ArrayList<Item>();
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in)) ;
		char ch ;
		Item i ;

		do
		{
			i = InputAcceptor.enterInput() ;
			i.calc_stl();
			
			
			
			list.add(i);
			System.out.print("Do you want to enter another item details(Enter y/n) : ");
			ch = obj.readLine().charAt(0) ;
		}while((ch=='y')||(ch=='Y'));
		
		Result.displayResultFormat();
		for (Item item : list) {
			Result.displayResult(item);
		}
		
	}
	
}
