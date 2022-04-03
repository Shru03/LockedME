
public class Menu {
	public static void displayMainMenu() {
		String mainMenu = "------MAIN MENU ------\n\n"
				+ "1. Display files inside \"LockFiles\" folder\n" 
				+ "2. Go for File operations: Searching, Adding or Deleting\n"
				+ "3. Exit program\n"
		        + "\nSelect an option from above and press Enter.\n";
		System.out.println(mainMenu);
		}
	public static void displayFileMenu() {
		String fileMenu = "------ FILE OPERATIONS MENU ------\n\n"
				+ "1. Add a file to \"LockFiles\" folder\n" 
				+ "2. Delete a file from \"LockFiles\" folder\n"
				+ "3. Search for a file from \"LockFiles\" folder\n" 
				+ "4. Show Previous Menu\n" 
				+ "5. Exit program\n"
		        + "\nSelect an option from above and press Enter.";
		System.out.println(fileMenu);
        }
}