package cfranc.com;

import static org.junit.Assert.*;
import java.io.File;
import org.junit.Test;

public class ConsoleTest {

	File file;
	boolean actual;

	@Test
	public void testNominalOpenFile() throws FileFormatException {
		File file = Console.openFile("test", ".test");
		boolean expected = true;
		boolean actual = file.exists();
		assertEquals(expected, actual);
	}

	@Test
	public void test_Empty_openFile_IllegalArgumentException() throws FileFormatException {
		try {
			file = Console.openFile("", "");
			actual = file.exists();
		} catch (IllegalArgumentException e) {
			actual = true;
		}
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_toto_null_openFile_exist() throws FileFormatException{
		File file = Console.openFile("test", null);
		boolean expected = true;
		boolean actual = file.exists();
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_null_null_openFile_NPE() throws FileFormatException{
		try {
			File file = Console.openFile(null, null);
			actual = file.exists();
		} catch (NullPointerException e) {
			actual = true;
		}
		boolean expected = true;
		assertEquals(expected, actual);
	}
}
