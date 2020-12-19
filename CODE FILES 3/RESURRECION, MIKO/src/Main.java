import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        PriorityQueue<String> nicknames = new PriorityQueue<String>();
    	System.out.println("Enter the nicknames of 4 of your classmates: ");
        for(int i=0; i<4; ++i) {
        	String name=in.next();
        	nicknames.add(name);
        }
        System.out.print("Press H to say Hi to each of them. ");
        String hi=in.next();
        Iterator it=nicknames.iterator();
        while(true) {
        	if(!it.hasNext())
        		break;
        	System.out.println("Hi "+it.next());
        	hi=in.next();
        }
        System.out.println("Done saying Hi");
	}
}
