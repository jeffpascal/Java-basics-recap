package niopaths;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InputOutputFiles {
	public static void main(String[] args) throws IOException {
		Path directory = Paths.get("C:\\Users\\JeanPascal\\Desktop\\Eclipseworkspaces");
		System.out.println(directory.normalize());
		System.out.println(directory.getParent()); // gets the parent 
		System.out.println(directory.resolve("Learningworkspaces"));
		
		Path project = Paths.get("."); //path of the project
		System.out.println(project.toAbsolutePath());
		System.out.println(project.toUri());
		
		Path p = Paths.get("C:\\Users\\JeanPascal\\git\\Java-basics-recap\\..");
		System.out.println("normalized" + p.normalize());
		System.out.println(project.getFileName());
		
		File localDir = new File("..");
		System.out.println(localDir);
		System.out.println(localDir.toPath().toAbsolutePath().normalize());
		
		
		//Files.createDirectory(Paths.get("data1")); //created directory data
		
		//create directories in form sub1/sub2/sub3
		Files.createDirectories(Paths.get("sub1", "sub2","sub3"));
		Files.createFile(Paths.get("sub1", "sub2","sub3","myfile.txt"));
		
		boolean deleted = Files.deleteIfExists(Paths.get("sub1", "sub2","sub3","myfile.txt"));
		//deleted = Files.deleteIfExists(Paths.get("data1"));
		deleted = Files.deleteIfExists(Paths.get("sub1", "sub2","sub3"));
		deleted = Files.deleteIfExists(Paths.get("sub1", "sub2"));
		deleted = Files.deleteIfExists(Paths.get("sub1"));
		
		Path sourceDir = Paths.get("src","niopaths", "filestore");
		//point to the data file
		Path dataFile = sourceDir.resolve("file.txt");
		System.out.println(Files.lines(dataFile).collect(Collectors.toList()));
		
		//destination of copy
		Path destination = Paths.get("data1");
		//copy data file to destination specify new file name
		Files.copy(dataFile,destination.resolve("filecopy.txt"));
		
		//delete copied file
		Files.delete(destination.resolve("filecopy.txt"));
		deleted = Files.deleteIfExists(Paths.get("data1"));
		
		Path javaDir = Paths.get("src");
		try (Stream<Path> entires = Files.walk(javaDir)){
			entires.forEach(System.out::println);
		}
	}
}
 