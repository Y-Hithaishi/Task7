package TTD_and_JUNIT_Task;
import java.io.*;
import java.util.Scanner;
public class Junit_class {
	public static void main(String[] gh) {
		Scanner scan=new Scanner(System.in);
		String input=scan.next();
		String result="";
		result=Remove(input);
		System.out.println(result);
	}
	static String Remove(String input) {  
                      k="";
                    for(int i=0;i<input.length();i++)
			{
			if(input.charAt(i)!='A')
			k=k+input.charAt(i);
			if(i>1 && input.charAt(i)=='A')
			k=k+input.charAt(i);
			}
                 return k;

		
	}
}
}