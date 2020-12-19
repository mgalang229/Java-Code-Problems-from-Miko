import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Map<String, String> students = new HashMap<String, String>();
		Scanner in = new Scanner(System.in);
		String tmp="";
		for(int i=0; i<3; ++i) {
			System.out.print("Enter student number: ");
			String snum=in.next();
			System.out.print("Enter first name " + (i+1) + ": ");
			String fname=in.next();
			students.put(snum, fname);
			tmp=snum;
		}
		System.out.println("Student List: ");
		for(Map.Entry<String, String> entry : students.entrySet())
			System.out.println(entry.getKey()+" "+entry.getValue());
		System.out.print("Enter student number: ");
		String snum=in.next();
		System.out.print("Enter first name " + 3 + ": ");
		String fname=in.next();
		students.put(snum, fname);
		students.remove(tmp);
		for(Map.Entry<String, String> entry : students.entrySet())
			System.out.println(entry.getKey()+" "+entry.getValue());
	}
}
