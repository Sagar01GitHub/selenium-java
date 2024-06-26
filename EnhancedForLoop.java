package CoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		int[]  arr = {1,2,4,5,6,7,8,9,10,122};
		
		//check if array has any multiple of 2 
		//2,4,6,8,10,122
		
		for(int i=0; i<arr.length; i++)
		{
			if (arr[i] % 2 == 0)
			{
				System.out.println(arr[i]);
			    break;
			}
			else
			{
				System.out.println(arr[i] + ": is not multiple of 2");
			}
		}
		
		System.out.println("----------------------");
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Learning");     //0 Index
		a.add("Selenium");     //1 Index
		a.add("Automation");   //2 Index
		a.add("Java");         //3 Index
		
		System.out.println(a.get(3));
		//a.remove(2);
		System.out.println(a.get(2));
		System.out.println("----------------------");
		
		for (int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("----------------------");
		
		for (String val:a)
		{
			System.out.println(val);
		}
		
		System.out.println("----------------------");
		
		//Item is present in array list
		System.out.println(a.contains("Selenium"));
		String[] name = {"Selenium","Java","Automation"};
		
		List<String> nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList.contains("Selenium"));
		
		
	}

}



