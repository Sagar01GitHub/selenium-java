package CoreJava;

public class StringDemo {

	public static void main(String[] args) {
		
		//string
		String a = "Hello";   //string literal-immutable
		String b = "Hello";
		String c =  a.concat("World");
        
		System.out.println(a);
		System.out.println(c);
		
		String s = new String("Hello");  //string class create new object every time in memory
		String s1= new String("Hello");
		
		System.out.println(s.equals(s1));  //equals operator check for content true
		System.out.println(s=s1);     //Hello
		System.out.println(s==s1);    //true
		System.out.println(b==s);     //false
		System.out.println(b==s1);    //fail matching the refrence  ==
		
		System.out.println("----------------------------------------");
		
		//StringBuffer and Stringbuilder-Mutable
		StringBuffer sb = new StringBuffer("Hello");
		
		sb.append("world");   
		System.out.println(sb);   //Helloworld

		sb.insert(2, "She");
		System.out.println(sb);   //HeShelloworld
		
		sb.replace(5, 7, "aa");
		System.out.println(sb);   //HeSheaaoworld
	
		sb.deleteCharAt(12);
		System.out.println(sb);   //HeSheaaoworl
		
		sb.reverse();
		System.out.println(sb);   //lrowoaaehSeH
	
		System.out.println("----------------------------------------");
		
		
		//StringBuilder- StringBuilder is not thread safe, It is non synchronizes, It is Faster
		
		StringBuilder sb1 = new StringBuilder("Hello");
		
		sb1.append("world");   
		System.out.println(sb1);   //Helloworld

		sb1.insert(2, "She");
		System.out.println(sb1);   //HeShelloworld
		
		sb1.replace(5, 7, "aa");
		System.out.println(sb1);   //HeSheaaoworld
	
		sb1.deleteCharAt(12);
		System.out.println(sb1);   //HeSheaaoworl
		
		sb1.reverse();
		System.out.println(sb1);   //lrowoaaehSeH
		
	}

}
