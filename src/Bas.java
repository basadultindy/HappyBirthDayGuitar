public class Bas extends Human {

	public Gift makeGift(String message, Bas from) {
		Gift gift = Gift.getInstance();
		gift.setMessage(message);
		gift.setFrom(from);

		return gift;
	}

	public void sendTo(Gift gift, Guitar to) {
		gift.setTo(to);
		System.out.println("This is a gift for you.");
	}
}
