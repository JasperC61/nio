import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamCopyTest {

	public static void main(String[] args) {
		try(BufferedReader bufInput = new BufferedReader(new FileReader("C:\\AA\\ABA.txt"));
	            BufferedWriter bufOutput = new BufferedWriter(new FileWriter("C:\\AA\\ABCD.txt"))) {
			
			String line = "";
				
				while((line =bufInput.readLine())!= null) {
					bufOutput.write(line);
					bufOutput.newLine();
				}
				
				
				
			
			}catch(FileNotFoundException f) {
				System.out.println("File not found " +f);
			}catch(IOException e) {
		System.out.println("Exception: " + e);
	}
	}}	

