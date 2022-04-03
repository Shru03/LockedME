
public class LockedMeMain {
	public static void main(String[] args) {
		
		//Welcome screen
		System.out.println("-------------------------");
		System.out.println("LockedMe.com");
		System.out.println("-------------------------");
		System.out.println("Developed By - Shruti Sharma @Company Lockers Pvt. Ltd.\n");
		
		String features = "This programme can be used to:\n" 
		        + " • Get the List of all the files in the \"LockFiles\" folder\n" 
				+ " • For searching, adding, or deleting files in the \"LockFiles\" folder.\n" ;
		
		//Showing Features of Program
		System.out.println(features);
		
		//Showing Main menu
		Menu.displayMainMenu();
		
		//Handle Main menu options
		ManageChoices manageChoices = new ManageChoices();
		manageChoices.mainMenuOptions();
	}

}
