import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			Bas bas = new Bas();
			Guitar guitar = new Guitar();
			Scanner sc = new Scanner(System.in);

			bas.setName("Bas");
			bas.setSex("male");

			System.out.print("Input Your Nickname : ");
			guitar.setName(sc.nextLine());
			System.out.print("Input Your Sex : ");
			guitar.setSex(sc.nextLine());
			System.out.print("Input Your Age : ");
			guitar.setAge(sc.nextInt());

			Gift gift = bas.makeGift("Happy Birth Day", bas);
			bas.sendTo(gift, guitar);

			System.out.print("Please accept it [Y/N] : ");
			guitar.takeGift((char) System.in.read(), gift);
		} catch (Exception e) {
			System.out.println("Input Error T_T");
		}

	}
}
