package lab7;
import java.io.*;
import java.util.*;
public class CopyFileContents {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//FileInputStream input = new FileInputStream("src/samplefile.txt");
		//System.out.println("Attempting to read from file in: "+input.getCanonicalPath());
		//FileOutputStream output = new FileOutputStream("copysample.txt");
		File inpfile = new File("src/samplefile.txt");
		File outfile = new File("copysample.txt");
		Scanner input = new Scanner(inpfile);
		PrintWriter output = new PrintWriter(outfile);
		
		while(input.hasNext()) {
			output.print(input.next());
			output.print(" ");
		}
		
		input.close();
		output.close();
	}

}
