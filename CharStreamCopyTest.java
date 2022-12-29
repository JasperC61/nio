import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamCopyTest {

	public static void main(String[] args) {
		char[] c = new char[128];
        try (FileReader fr = new FileReader("C:\\AA\\ABA.txt");
            FileWriter fw = new FileWriter("C:\\AA\\ABCDE.txt")) {
            int count = 0;
            int read = 0;
            while ((read = fr.read(c)) != -1) {
                fw.write(c,0,read);
                count += read;
            }
            System.out.println("Wrote: " + count + " characters.");
        } catch (FileNotFoundException f) {
            System.out.println("File " + args[0] + " not found.");
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
    }
}

	
