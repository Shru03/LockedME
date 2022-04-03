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
		
		SearchingFile a = new SearchingFile();
		a.getList();
		a.find(fname);
	}
	
	//Gets the filenames from the directory and adds them to an array list for searching the files.
	public void getList() {				
      String[] str = dir.list();
      
      if (str == null) {
         System.out.println( "Directory Empty.");
      } else { 
         for (int i = 0; i< str.length; i++) {
            String filename = str[i];
            listfname.add(filename);
         }
      }  
      
	}
	
	//Checking if the file is present in the array list
	public void find(String fname) {
		boolean present = listfname.contains(fname); 
		
		if (present) 
            System.out.println("File is Found at location : " + dir); 
        else
        	System.out.println("File Not Found in the directory."); 
	}

}