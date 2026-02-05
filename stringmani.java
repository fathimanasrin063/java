import java.io.*;
import java.util.*;
class stringmani
{
public static void main(String [] args)
{
Scanner s = new Scanner(System.in);
String a,b,c;
System.out.println("Enter a string:");
a=s.next();
System.out.println("Enter another string:");
b=s.next();
c=a+b;
System.out.println("Length of 1st string:"+a.length());
System.out.println("Length of 2nd string:"+b.length());
System.out.println("concatenate of string:"+c);
System.out.println("character at position 5 of "+c+":"+c.charAt(5));
System.out.println("comparison of strings:"+a.compareTo(b));
System.out.println("Last index of 's' is :"+c.lastIndexOf('s'));
System.out.println("Endswith character 'r':"+c.endsWith("r"));
System.out.println("conversion to uppercase:"+c.toUpperCase());
System.out.println("conversion to lowercase:"+c.toLowerCase());
}
}

