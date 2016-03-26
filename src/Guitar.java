public class Guitar extends Human {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void takeGift(char accept, Gift gift) {
		if(acceptCondition(accept)){
			gift.show();
		}
	}
	
	private boolean acceptCondition(char accept) {
		return (accept=='Y'||accept=='y')?true:false;
	}
}
