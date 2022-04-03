import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class DisplayFilesAO {
		
		 File dir = new File ("C:\\Users\\siddh\\eclipse-workspace\\LockedME\\LockFiles");
	     ArrayList<String> fileList = new ArrayList<>();
		
		public void ascendOrder() {
			String[] fil = dir.list();
			
			if (fil ==null) {
				System.out.println("No files in Directory");
			}else {
				for (int i=0; i< fil.length; i++) {
					String filename = fil[i];
					fileList.add(filename);
				}
			}
			
		
		Collections.sort(fileList);
		System.out.println("Files in Ascending Order");
		}
			
	}
	
