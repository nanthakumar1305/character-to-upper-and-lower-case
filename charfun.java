import java.io.*;
import java.util.*;
public class charfun
{
	public static void main(String args[])
	{
		char c,u,l; 
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter a single Character");
		char ch=inp.next().charAt(0);
		if(Character.isUpperCase(ch))
		{
			System.out.println("The given character is capital letter");
		}
		if(Character.isLowerCase(ch))
		{
			System.out.println("The given character is small letter");
		}
		System.out.println(Character.toUpperCase(ch));
		System.out.println(Character.toLowerCase(ch));
	}
}