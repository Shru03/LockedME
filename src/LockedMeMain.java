
public class LockedMeMain {
	public static void main(String[] args) {
		
		System.out.println("*************************");
		System.out.println("LockedMe.com");
		System.out.println("*************************");
		System.out.println("Developed By - Shruti Sharma @Company Lockers Pvt. Ltd.\n");
		
		String features = "This programme can be used to:\n" 
		        + " • Get the List of all the files in the \"main\" folder\n" 
				+ " • In the \"main\" folder, search, add, or delete files.\n" 
				+ "** When looking for or removing files, please be sure to use the right filename. **\n";
		
		System.out.println(features);
		Menu.displayMainMenu();
		ManageChoices manageChoices = new ManageChoices();
		manageChoices.mainMenuOptions();
	}

}
