public class Gift {
	private static Gift instance = null;
	private String message;
	private Bas from;
	private Guitar to;

	private Gift(){}
	
	public static Gift getInstance() {
		if(instance==null)
			instance = new Gift();
		return instance;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	public void setFrom(Bas from) {
		this.from = from;
	}

	public void setTo(Guitar to) {
		this.to = to;
	}
	
	public void show() {
		System.out.println("             * *");
		System.out.println("            *   *");
		System.out.println("             * *");
		System.out.println("        ______|_______");
		System.out.println("       |              |");
		System.out.println("      |     "+to.getName()+"     |");
		System.out.println("   __|__________________|__");
		System.out.println("  |******   "+to.getAge()+" Year  ******|");
		System.out.println("  |      *****  *****      |");
		System.out.println(" _|___________**___________|_");
		System.out.println("|@      "+message+"     @|");
		System.out.println("| @@@@@@              @@@@@@ |");
		System.out.println("|       @@@@@@  @@@@@@       |");
		System.out.println("|_____________@@_____________|");
		System.out.println("|____________________________|");
		System.out.println("From :"+from.getName());
	}
}
