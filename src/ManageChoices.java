import java.util.Scanner;

public class ManageChoices {
  public void mainMenuOptions() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
	do {	
		try {
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1: 
				DisplayFilesAO ao = new DisplayFilesAO();
				ao.ascendOrder();	
				break;
			case 2:
				Menu.displayFileMenu();
				ManageChoices manageChoices = new ManageChoices();
				manageChoices.fileMenuOptions();
				break;
			case 3:
				System.out.println("Program exited successfully");
				running =false;
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Please enter a valid option");
			}
		} catch (Exception e) {
			e.printStackTrace();
			mainMenuOptions();
		}
	}while (running ==true);
  }
  
  public void fileMenuOptions() {
	  boolean running = true;
	  Scanner sc = new Scanner(System.in); 
	  do {
		try {
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				AddingFile ad = new AddingFile();
				ad.addFile();
				break;
			case 2:
				DeletingFile dl = new DeletingFile();
				dl.delFile();
				break;
			case 3:
				SearchingFile sf = new SearchingFile();
				sf.searchFile();
				break;
			case 4:
				Menu.displayMainMenu();
				break;
			case 5:
				System.out.println("Program exited successfully");
				running =false;
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Please enter valid Input.");
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	} while (running == true);
  }
  
}
	  
	  
		
  

