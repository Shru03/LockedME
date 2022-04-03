import java.io.File;
import java.util.Scanner;

public class DeletingFile {
	Scanner sc = new Scanner(System.in);
	String fname;
	
	File dir = new File ("C:\\Users\\siddh\\eclipse-workspace\\LockedME\\LockFiles");
	
	//Takes the filename of the file to be removed and calls the file deletion function.
	public void delFile() {
		DeletingFile d = new DeletingFile();
		System.out.println("\nChoose File to delete : ");
		d.printFile();
		
		System.out.println("Enter file name to be deleted : ");
		fname = sc.next();
		
		d.deleteFile(fname);
	}
    
	//Deleting file from directory
	public void deleteFile(String fname) {
		File file = new File(dir, fname); 
		
		if(file.delete())
			System.out.println(file.getName() +" file is Deleted");
		else
			System.out.println("No such file present");			
	}
    
	//Display the files of directory
	public void printFile() {
		String[] st = dir.list();
		
		if (st ==null) {
			System.out.println("No files in Directory");
		}else {
			for (int i=0; i< st.length; i++) {
				String filename = st[i];
				System.out.println(filename);
			}
		}
	}

}
