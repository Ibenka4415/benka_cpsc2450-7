import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class EmailPrinter {
	

	

	   
	    public static void printScreen(ArrayList<Email> emails) {
	        for (Email email : emails) {
	            System.out.println(email.toString());
	        }
	    }

	    
	 
	    public static boolean printToFile(ArrayList<Email> emails, String filename) {
	        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename)))) {
	            for (Email email : emails) {
	                writer.println(email.getSummary());
	            }
	            return true;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
	}


