import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Map<String, String> programs = new HashMap<String, String>();
		programs.put("BSIT", "Bachelor of Science in Information Technology");
		programs.put("BSCS", "Bachelor of Science in Computer Science");
		programs.put("BSIS", "Bachelor of Science in Information Systems");
		for(Map.Entry<String, String> entry : programs.entrySet())
			System.out.print(entry.getKey()+" ");
		programs.remove("BSIT");
		System.out.println();
		System.out.println(programs.containsKey("BSCpE")?"Key exists":"Key doesn't exist");
	}
}
