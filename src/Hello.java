/**
 * 
 */

/**
 * @author HLE35
 *
 */
public class Hello {

	String greeting ;

	Hello (String greeting) {
		this.greeting = greeting;
	}

	public static void main(String[] args) { 
		 Hello myHello = new Hello("Hi.");
	     System.out.println(myHello.getGreeting());
	}

	/**
	 * @param args
	 */
	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

}
