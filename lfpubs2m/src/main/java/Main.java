import edu.casetools.lfpubs2m.LFPUBS2MTranslator;

public class Main {

	public static void main(String[] args) {
		System.out.println("Initializing...");
		LFPUBS2MTranslator translator = new LFPUBS2MTranslator(true);
		System.out.println("- - - - - - - - - - - - - - - - - - -");
		System.out.println(""+translator.getTranslation("C:/LFPUBS/test.txt"));
		System.out.println("- - - - - - - - - - - - - - - - - - -");
		System.out.println("Ending...");
	}

}