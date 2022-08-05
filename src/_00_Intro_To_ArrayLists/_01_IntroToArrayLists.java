package _00_Intro_To_ArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
    public static void main(String[] args) {
        // 1. Create an array list of Strings
        //    Don't forget to import the ArrayList class
    	ArrayList<String> str = new ArrayList<String>();
        // 2. Add five Strings to your list
    	str.add("1");
    	str.add("2");
    	str.add("3");
    	str.add("4");
    	str.add("5");
    	str.add("store");
        // 3. Print all the Strings using a standard for-loop
    	for (int i = 0; i < str.size(); i++) {
    		System.out.println(str.get(i));
    	}
        // 4. Print all the Strings using a for-each loop
    	for (String a: str) {
    		System.out.println(a);
    	}
        // 5. Print only the even numbered elements in the list.
    	for (int i = 0; i < str.size(); i++) {
    		if ((i%2) == 0) {
    			System.out.println(str.get(i));
    		}
    	}
        // 6. Print all the Strings in reverse order.
    	for (int i = str.size() - 1; i >= 0; i--) {
    		System.out.println(str.get(i));
    	}
        // 7. Print only the Strings that have the letter 'e' in them.
    	for (int i = 0; i < str.size(); i++) {
    		for (int j = 0; j < str.get(i).length(); j++)
    		if (str.get(i).charAt(j) == 'e') {
    			System.out.println(str.get(i));
    		}
    	}
    	String s = "";
    	System.out.println(s.length());
    }
}
