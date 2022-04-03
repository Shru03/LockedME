import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DisplayFilesAO {
		
	
	public void ascendOrder() {	
	File fileDir = new File("C:\\Users\\siddh\\eclipse-workspace\\LockedME\\LockFiles");
	
	if(fileDir.isDirectory()){
		List<String> listFile = Arrays.asList(fileDir.list());
		Collections.sort(listFile);
		System.out.println("-------------Sorting by filename in ascending order------------\n");
		for(String s:listFile){
			System.out.println(s);
		}
	}
	else{
		System.out.println(fileDir.getAbsolutePath() + " is not a directory");
	}
  }
}
	
