package hunb.mutation_pi;

public class SampleController2 {

	public String message(int a) {
		
		String returnMessage = "";
		
		returnMessage = ( (a % 2) == 0 ) ?  "HELLO!" : "GOOD BYE!";
		
		return returnMessage;
		
	}
}
