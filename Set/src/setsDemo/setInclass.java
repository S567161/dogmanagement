package setsDemo;

import java.util.*;
public class setInclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set1 = new HashSet<>();
		System.out.println("Set1 is " +set1);
		
		Scanner sc = new Scanner(System.in);
		
		boolean loop = false;
		while(!loop) {
			System.out.println("Enter the names: ");
			String name= sc.nextLine();
			if(name.equals("END")) {
				loop=true;
			}
			else {
				boolean check = set1.add(name);
				if(!check) {
					System.out.println("There is a duplicate element in the set.");
				}
			}
		}
		System.out.println("Set1 is" +set1);
		System.out.println("Hashcode of Set1 is: " + set1.hashCode());

	}

}
