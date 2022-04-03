import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchingFile {
	Scanner sc = new Scanner(System.in);
	
	File dir = new File ("C:\\Users\\siddh\\eclipse-workspace\\LockedME\\LockedFiles");
	ArrayList<String> fileList = new ArrayList<>();
	String fname;
	
	
	public void searchFile() {
	
		System.out.print("Enter file name : ");
		fname = sc.next();
		
		SearchingFile a = new SearchingFile();
		a.searchList();
		a.search(fname);
	}
	
	public void searchList() {				
      String[] st = dir.list();
      
      if (st == null) {
         System.out.println( "No files in Directory.");
      } else { 
         for (int i = 0; i< st.length; i++) {
            String filename = st[i];
            fileList.add(filename);
         }
      }  
      
	}
	
	public void search(String fileName) {
		boolean ifFound = fileList.contains(fileName); 
		
		if (ifFound) 
            System.out.println("File is Present in the directory"); 
        else
        	System.out.println("File is not present in the directory."); 
	}
	
}

