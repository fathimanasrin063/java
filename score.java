import java.io.*;
import java.util.*;
class student
{
String name="jerin";
String batch="MCA";
}
class sports extends student
{
String sports = "cricket";
}
class result extends sports
{
String result="win";
void display()
{
System.out.println("Student name:"+name);
System.out.println("Student class:"+batch);
System.out.println("Student participated in:"+sports);
System.out.println("Sports result:"+result);
}
}
class score
{
public static void main(String args[])
{
result r =new result();
r.display();
}
}
