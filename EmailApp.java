
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmailApp {
	/**
	 * this is the welcome banner
	 */
	public static void welcomeBanner() {
		System.out.println("********************************************************");
		System.out.printf("%40s","Emailer Version 1.0\n");
		System.out.println("********************************************************");
	}
/**
 * This is the print menu for the user to see
 */
	public static void printMenu() {
		System.out.println("1. Wright Email");
		System.out.println("2. List Email");
		System.out.println("3. Send Email");
		System.out.println("4. Save Emails to File");
		System.out.println("5. Exit");
		
	}
	 private static Email wrightEmail( Scanner scanner) {
		 	Email email = new Email();
	        System.out.print("Enter recipients Email: ");
	        String recipientsInput = scanner.nextLine();
	        List<String> recipients = new ArrayList<>(List.of(recipientsInput.split(" ")));

	        System.out.print("Enter subject: ");
	        String subject = scanner.nextLine();
	        System.out.print("Enter body: ");
	        String body = scanner.nextLine();

	        email.setRecipients(recipients);
	        email.setSubject(subject);
	        email.setBody(body);

	        System.out.println("Email composed successfully!");
	        return email;
	    }
	 
	

	private static void listEmail(Email email) {
	        System.out.println("\nEmail Details:");
	        System.out.println(email.toString());
	    } 
	 
	 
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Email> email = new ArrayList<Email>();
        welcomeBanner();
        String fileName;
        String choice;
        do {
        	printMenu();
        	System.out.print("Enter the number of your Choice: ");
        	choice = sc.nextLine().toLowerCase();
        	if (choice.equals("1")) {
        		email.add(wrightEmail(sc));
        	}else if (choice.equals("2")){
        		for (Email e : email) {
        			listEmail(e);
        		}
        		
        	}else if (choice.equals("3")){
        		for (Email e : email) {
        			e.send();
        		}
        	}else if (choice.equals("4")){
        		System.out.print("Enter the name of the fille to save: ");
        		fileName =sc.nextLine();
        		
        		String filePath =fileName;
        		
        		if (EmailPrinter.printToFile(email, filePath)){
        			System.out.println("");
        			System.out.println("the files are sent");
        		}else {
        			System.out.println("the files did not send");
        		}
        			
        		
        		
        	}else if (!choice.equals("5")){
        		System.out.println("THank you for using this Program!");
        	}
        }while(!choice.equals("5"));
        System.out.println("THank you for using this Program!");
	}
}
