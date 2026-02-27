package PrintSpooler.v;

public class PrintSpooler {

	private static PrintSpooler instance;
	
	private PrintSpooler() {
		init();
	}
	
	private void init() {
		System.out.println("PrintSpooler initalized . . .");
	}
	public static PrintSpooler getInstance() {
		if (instance == null) {
			instance = new PrintSpooler();
		}
		return instance;
	}
	public void print(String document) {
        System.out.println("Printing: " + document);
    }
}
