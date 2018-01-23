package cfranc.com;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Console {

	public static void main(String[] args) {
//		String fileName = "qwerty";
//		String extension = null;
//		
//		try {
//			openFile(fileName, extension);
//		} catch (FileFormatException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		System.out.println("Strart...");
		
		String[] args1 = {"file", ".tmp"};
		doAction(args1);
	}
	
	static File openFile(String fileName, String extension) throws FileFormatException {
		File res = null;
		
		if(extension != ".tmp") {
			throw new FileFormatException("Le nom\r\n" + 
					"d'extension doit être \"tmp\"");
		}
		
		try {
			res = File.createTempFile(fileName, extension);
			System.out.println("File is ready...");
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error....");
		}
	
		return res;
		
	}
	
	public static void doAction(String args[]) {
		String fileName = null;
		String extension = null;
		if(args.length == 2) {
			if (args[0] !=null || args[1] != null) {
				fileName = args[0];
				extension = args[1];
			} else {
				System.out.println("Le nom de fichier et l'extention ne doivent etre NULL");
				return;
			}
		} else {
			System.out.println("Il faut donner le nom et l'extension à fichier");
			return;
		}
		try {
			openFile(fileName, extension);
		} catch (FileFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Le nom d'extension doit être \"tmp\"");
		}
	}
}
