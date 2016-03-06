import org.junit.Test;
import junit.framework.TestCase;
import java.io.IOException;

public class DriverProgram extends TestCase{
	//for adding Entries
	@Test
	public void testThatEntryWasAdded() throws IOException {
		PhoneDirectory testDirect = new PhoneDirectory();
	    testDirect.addEntry("Alanna", "123");
	    assertEquals("Alanna must be located in phone.properties", "123", testDirect.getNumber("Alanna"));
	}
	
	//for deleting entries
	@Test
	public void testThatEntryWasDeleted() throws IOException {
		PhoneDirectory testDirect = new PhoneDirectory();
	    testDirect.addEntry("Bob", "456");
	    testDirect.addEntry("Mike", "789");
	    testDirect.deleteEntry("Bob");
	    assertEquals("Bob must be removed from phone.properties ", "" , testDirect.getNumber("Bob"));
	}
	
	//for getting numbers
	@Test
	public void testThatNumberOfPersonIsFound() throws IOException {
		PhoneDirectory testDirect = new PhoneDirectory();
	    testDirect.addEntry("Mike", "456");
	    testDirect.addEntry("Rob", "789");
	    assertEquals("Rob's number should be '789'", "789", testDirect.getNumber("Rob"));
	}
	
	//for changing entries
	@Test
	public void testThatNumberOfPersonIsChanged() throws IOException {
		PhoneDirectory testDirect = new PhoneDirectory();
	    testDirect.addEntry("Dan", "456");
	    testDirect.addEntry("Rick", "789");
	    assertEquals("Dan's number should be 456", "456", testDirect.getNumber("Dan"));
	    testDirect.changeEntry("Dan", "31232");
	    assertEquals("Dan's new number should have changed", "31232", testDirect.getNumber("Dan"));
	}
}
