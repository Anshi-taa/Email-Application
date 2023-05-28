package Emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("Anshita","Verma");
		//em1.setAlternateEmail("anshigmail.com");
		//System.out.println("your alternate email:"+em1.getAlternateEmail());
		System.out.println(em1.showInfo());

	}

}
