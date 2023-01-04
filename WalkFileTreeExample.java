import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class WalkFileTreeExample {

	public static void main(String[] args) throws IOException {
		String pathString ="C:\\";
		Files.walkFileTree(Paths.get(pathString), new FileVisitor<Path>() {
			
			public FileVisitResult preVisitDirectory(Path dir,BasicFileAttributes attrs ) throws IOException { 
				return FileVisitResult.CONTINUE;}

			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
				String filename=file.toAbsolutePath().toString();
				if(filename.toLowerCase().endsWith(".java")){
				System.out.println("visitFile:"+file.toAbsolutePath()+(attrs.isRegularFile()?("size:+"+attrs.size()):""));
						return FileVisitResult.CONTINUE;}
				
				return FileVisitResult.CONTINUE;
			}
			@Override
			public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
				System.out.println("visitFile:"+file.toAbsolutePath());
				return FileVisitResult.CONTINUE;
			}

			@Override
			public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
				System.out.println("postVisitDirectory"+dir.toAbsolutePath());
				return FileVisitResult.CONTINUE;
			}
			
		});
		
		

	}

}
