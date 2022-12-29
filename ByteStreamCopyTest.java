import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamCopyTest {

	public static void main(String[] args) {
		byte[] b=new byte[128];
		int count = 0;
		int read = 0;
		try (FileInputStream fis = new FileInputStream (args[0]);
				FileOutputStream fos = new FileOutputStream (args[1])) {
				
				System.out.println ("Bytes available: " + fis.available());

				while ((read = fis.read(b)) != -1)
					fos.write(b);
				count += read;
		} catch (FileNotFoundException f) {
			System.out.println ("File not found: " + f);
			f.printStackTrace();
		} catch (IOException e) {
			System.out.println ("Wrote: " + count);	
			e.printStackTrace();
		}
		
				
		
	
	
	}
}

