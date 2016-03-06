import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/** All the associated methods that deal with
 * the creation of an address book.  
*
* @author Alanna Walton
*/

public class PhoneDirectory {
	
	/**
	 * Adds a New Entry to the Address Book. 
	 * 
	 * This method does not delete the previous entries when appending
	 * the newest one to the Address Book. 
	 *
	 * @param  name the name of the person being added to the Address Book
	 * @param  number the number associated with the named addee.
	 * @throws IOException Prints out exception if items cannot be added to Address Book 
	 */
	
	public void addEntry(String name, String number) throws IOException{
		File file = new File("C:/Users/Alanna/workspace/Phone Directory/src/main/resources/phone.properties");
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(file, true);
		try {
			Properties prop = new Properties();
 
			prop.load(fis);
			
			//make 'name' the key and 'number' the value			
			prop.setProperty(name, number);
			
			System.out.println("New entry in Address Book!");
			
			prop.store(fos, null);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			fis.close();
		}
	}
	
	
	/**
	 * Deletes an entry that was previously in the Address Book. 
	 * 
	 * This method asks for the name of the person that is to be
	 * deleted, then searches and removes them from the Address Book.
	 *
	 * @param  name the name of the person being deleted the Address Book
	 * @throws IOException Prints out exception if items cannot be added to Address Book 
	 */
	
	public void deleteEntry(String name)throws IOException{
		File file = new File("C:/Users/Alanna/workspace/Phone Directory/src/main/resources/phone.properties");
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(file);
		try {
			Properties prop = new Properties();
 
			prop.load(fis);
			
			//delete name and number
			prop.remove(name);
			
			System.out.println("Entry deleted from Address Book!");
			prop.store(fos, null);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			fis.close();
		}
		
	}
	
	
	/**
	 * Finds the number of the person in the Address Book. 
	 * 
	 * If the name you are looking for does not exist within
	 * the Address Book, an empty string is returned. 
	 *
	 * @param  name the name of the person being added to the Address Book
	 * @throws IOException Prints out exception if items cannot be added to Address Book 
	 * @return  number of person or ""
	 */
	
	public String getNumber(String name) throws IOException{
		File file = new File("C:/Users/Alanna/workspace/Phone Directory/src/main/resources/phone.properties");
		FileInputStream fis = new FileInputStream(file);
		String number = null;
		try {
			Properties prop = new Properties();
 
			prop.load(fis);
 
			// fetch number by using name
			number = prop.getProperty(name);
			
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			fis.close();
		}
		if (number != null) {
			return number;
		}
		else {
			return "";
		}
	}
	
	/**
	 * Changes phone number of person already in Address Book. 
	 *  
	 * Must include the name of the person you are looking to change
	 * the number as well as the new number as parameters. The Address
	 * Book will then be automatically updated.
	 *
	 * @param  name the name of the person being added to the Address Book
	 * @param  number newest number you want to be associated with the person.
	 * @throws IOException Prints out exception if items cannot be added to Address Book      
	 */
	
	public void changeEntry(String name, String number) throws IOException{
		File file = new File("C:/Users/Alanna/workspace/Phone Directory/src/main/resources/phone.properties");
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(file, true);
		try {
			Properties prop = new Properties();
			prop.load(fis);
 
			if (prop.getProperty(name) != null) {
				// set the properties value
				prop.setProperty(name, number);
				System.out.println("Address Book Successfully Updated..");
			}
			else {
				System.out.println("Name not found in Address Book...");
			}	
			
			prop.store(fos, null);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			fos.close();
			fis.close();
		}
	}
}
