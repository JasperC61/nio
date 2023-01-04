import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadAllNio {

	public static void main(String[] args) {
		
		
		Path file=Paths.get("C:\\AA\\ABA.txt");
		List<String> fileArr;
		
		
		try{fileArr=Files.readAllLines(file);
				fileArr.stream()
				.filter(line->line.contains("文字"))
				.forEach(line->System.out.println(line));
	}
	   catch (IOException e) {
		
		e.printStackTrace();
		
		System.out.println("Message:"+e.getMessage());
	}
}}
