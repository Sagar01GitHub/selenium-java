package CoreJava;

public class StringClassDemo {

	public static void main(String[] args) {
		
		
		//String = it is one of the prebuild class in java
	   /*1.String literal
	     2.by creating object of string*/
		
		String a = " javatraining";
		
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("e"));
		System.out.println(a.substring(3, 6));
		System.out.println(a.substring(3));
		System.out.println(a.concat(" with selenium"));
		System.out.println(a.trim());
		System.out.println(a.trim().toUpperCase());
	  //a.toLowerCase();
		
		//split
		String arr[] = a.split("t");
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("t", "s"));
	}

}
