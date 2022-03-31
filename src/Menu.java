
public class Menu {
	public void displayMainMenu() {
		String mainMenu = "------MAIN MENU ------"
				+ "1) Display files inside \"Locked Files\" folder\n" 
				+ "2) Go for File operations: Searching, Adding or Deleting\n"
				+ "3) Exit program\n"
		        + "\n\nSelect an option from above and press Enter.\n";
		System.out.println(mainMenu);
		}
	public void displayFileMenu() {
		String fileMenu = "------ FILE OPERATIONS MENU ------"
				+ "1) Add a file to \"Locked Files\" folder\n" 
				+ "2) Delete a file from \"Locked Files\" folder\n"
				+ "3) Search for a file from \"Locked Files\" folder\n" 
				+ "4) Show Previous Menu\n" 
				+ "5) Exit program\n"
		        + "\n\nSelect an option from above and press Enter.\n\n";
		System.out.println(fileMenu);
}

}
