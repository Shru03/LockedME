import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchingFile {
Scanner sc = new Scanner(System.in);
	
	File dir = new File ("C:\\Users\\siddh\\eclipse-workspace\\LockedME\\LockFiles");
	ArrayList<String> listfname = new ArrayList<>();
	String fname;
	
	public void searchFile() {

		System.out.print("Enter filename to be searched : ");
		fname = sc.next();
		
		SearchingFile sf = new SearchingFile();
		sf.searchList();
		sf.search(fname);
	}
	
	public void searchList() {				
      String[] children = dir.list();
      
      if (children == null) {
         System.out.println( "Directory Empty.");
      } else { 
         for (int i = 0; i< children.length; i++) {
            String filename = children[i];
            listfname.add(filename);
         }
      }  
      
	}
	
	public void search(String fname) {
		boolean present = listfname.contains(fname); 
		
		if (present) 
            System.out.println("File is Present in the directory"); 
        else
        	System.out.println("File is not present in the directory."); 
	}

}