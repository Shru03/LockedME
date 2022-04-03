import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AddingFile {
	Scanner sc = new Scanner(System.in);
	String fname;
	
	public void addFile() {
		//Accepting name of the file from the user 
		System.out.print("Enter file name : ");
		fname = sc.next();
		
		//Calling CreateFile function to create the file 
		AddingFile a = new AddingFile();
		a.createFile(fname);
	}

	public void createFile(String fname2) {
		File dir = new File ("C:\\Users\\siddh\\eclipse-workspace\\LockedME\\LockFiles");
		File file = new File(dir, fname);
		
		try {
			if(file.createNewFile()) {
				System.out.println("Created a File: " + file.getName());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
