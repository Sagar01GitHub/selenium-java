package CoreJava;

public class ReverseStringDemo {

	public static void main(String[] args) {
		
		//Reverse string 
		String s = "Madam";
		String t = "";
		  
		for(int i=s.length()-1; i>=0; i--)
		{
			t = t+s.charAt(i);
		}
		
		System.out.println(t);
		
		
		//palindrom
		if(s==t)
		{
			System.out.println("It is palindrom");
		}
		else
		{
			System.out.println("It is not palindrom");
		}
	}

	
}
