
public class LockedMeMain {
	public static void main(String[] args) {
		
		//Prints welcome screen
		System.out.println("-------------------------");
		System.out.println("LockedMe.com");
		System.out.println("-------------------------");
		System.out.println("Developed By - Shruti Sharma @Company Lockers Pvt. Ltd.\n");
		
		String features = "This programme can be used to:\n" 
		        + " • Get the List of all the files in the \"LockFiles\" folder\n" 
				+ " • For searching, adding, or deleting files in the \"LockFiles\" folder.\n" ;
		
		//Prints features of program
		System.out.println(features);
		
		//Prints Main menu
		Menu.displayMainMenu();
		
		//Handles Main menu options by calling mainMenuOptions method of class ManageChoices.
		ManageChoices manageChoices = new ManageChoices();
		manageChoices.mainMenuOptions();
	}

}
