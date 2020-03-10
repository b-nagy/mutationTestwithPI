package hunb.mutation_pi;

public class GroupMessage {

	private final String salutation = "HELLO!";
	private final String parting = "GOOD BYE!";
	
	public GroupMessage() {
	}
	
	public String greeting(int a) { 
		return ( (a % 2) == 0 ) ?  salutation : parting;
	}
}
