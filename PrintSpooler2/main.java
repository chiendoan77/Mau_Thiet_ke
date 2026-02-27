package PrintSpooler.v;

public class main {

	public static void main(String[] args) {
		PrintSpooler p1 = PrintSpooler.getInstance();
		PrintSpooler p2 = PrintSpooler.getInstance();
		
		System.out.println(p1 == p2);
	}

}
