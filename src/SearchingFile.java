import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchingFile {
Scanner sc = new Scanner(System.in);
	
	File dir = new File ("C:\\Users\\siddh\\eclipse-workspace\\LockedME\\LockFiles");
	ArrayList<String> listfname = new ArrayList<>();
	String fname;
	
	//Takes the name of the file to be searched and calls the method that will do the searching.
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
            System.out.println("File is Found at location : " + dir); 
        else
        	System.out.println("File Not Found in the directory."); 
	}

}