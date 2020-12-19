import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashSet<String> group1 = new HashSet<String>();
		for(int i=0; i<3; ++i) {
			System.out.print("Enter birth month "+(i+1)+ ": ");
			String tmp=in.next();
			group1.add(tmp);
		}
		HashSet<String> group2 = new HashSet<String>();
		for(int i=0; i<3; ++i) {
			System.out.print("Enter birth month "+(i+1)+ ": ");
			String tmp=in.next();
			group2.add(tmp);
		}
		System.out.println("Group 1: "+group1);
		System.out.println("Group 2: "+group2);
		System.out.print("Enter your birth month: ");
		String self=in.next();
        Set<String> st1 = new HashSet<String>(group1);
        st1.addAll(group2);
        System.out.println("Union: "+st1);
        Set<String> st2 = new HashSet<String>(group1);
        st2.retainAll(group2);
        System.out.println("Intersection: "+st2);
        Set<String> st3 = new HashSet<String>(group1);
        st3.removeAll(group2);
        System.out.println("Difference: "+st3);
        boolean ok1=group1.contains(self);
        boolean ok2=group2.contains(self);
        if(ok1||ok2)
        	System.out.println("You have the same birth month with one of your classmates.");
	}
}
