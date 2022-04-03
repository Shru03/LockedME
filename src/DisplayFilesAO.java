import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//displays the file's contents in ascending order.
public class DisplayFilesAO {
		
	
	public void ascendOrder() {	
	File fileDir = new File("C:\\Users\\siddh\\eclipse-workspace\\LockedME\\LockFiles");
	
	//Arrange contents of the directory in ascending order
	if(fileDir.isDirectory()){
		List<String> listFile = Arrays.asList(fileDir.list());
		Collections.sort(listFile);
		System.out.println("-------------Sorting by filename in ascending order------------\n");
		for(String s:listFile){
			System.out.println(s);
		}
		System.out.println("\n");
	}
	else{
		System.out.println(fileDir.getAbsolutePath() + " is not a directory");
	}
  }
}
	
