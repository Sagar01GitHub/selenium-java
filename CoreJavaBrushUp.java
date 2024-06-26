package CoreJava;

public class CoreJavaBrushUp {

	public static void main(String[] args) {
		
		int myNum = 5;
		String website = "Selenium automation";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		
		System.out.println(myNum + ": is the value stored in myNum variable");
		System.out.println(website + "   " +letter);
		System.out.println(dec + ":decimal" + " "+ "and its"+"  " + myCard);
		
		//Array
		 int[] arr = new int[5];
		 
		 arr[0] = 1;
		 arr[1] = 2;
		 arr[2] = 4;
		 arr[3] = 5;
		 arr[4] = 6;
		 
		 int[] arr2 = {1,2,4,5,6,7,8,9,10,11};
		 
		System.out.println(arr2[2]);  //4
		System.out.println(arr[4]);   //6
		
		//using for loop
		for (int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		for (int i=0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		
		
		String[] name = {"Sagar","Mundale","Selenium","Java"};
		
		for (int i=0; i< name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		for (String s: name)
		{
			System.out.println(s);
		}
	}

}

