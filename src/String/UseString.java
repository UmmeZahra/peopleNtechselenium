package String;

public class UseString {

	public static void main(String[] args) {

String len = "Returns the length of this string";
System.out.println(len.length());
		
String text = "I am a java developer";
System.out.println(text.toUpperCase());

String a = "Returns the char value at the specified index. An index ranges from 0 to length()";
char value = a.charAt(8);
System.out.println(value);

String b = "Returns the code point value of the character at the index";
int value2 = b.codePointAt(5);
System.out.println(value2);

String c = "Returns the number of Unicode code points in the specified text range";
int beginIndex = 1;
int endIndex = 25;
int value3 = c.codePointCount(beginIndex, endIndex);
System.out.println(value3);




	}

}
