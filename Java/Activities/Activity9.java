package Activities;

import java.util.ArrayList;

public class Activity9 {
		public static void main(String[] args) {
			ArrayList<String> myList = new  ArrayList<String>();
			myList.add("apple");
			myList.add("mango");
			myList.add("orange");
			myList.add(3,"grapes");
			myList.add(1,"papaya");
			
			System.out.println("print all the objects:");
			for(String s:myList) {
				System.out.println(s);
			}
			System.out.println("3rd element in the list is: " + myList.get(2));
	        System.out.println("Is Chicku is in list: " + myList.contains("Chicku"));
	        System.out.println("Size of ArrayList: " + myList.size());
	        
	        myList.remove("Papaya");
	        
	        System.out.println("New Size of ArrayList: " + myList.size());
		}
}
