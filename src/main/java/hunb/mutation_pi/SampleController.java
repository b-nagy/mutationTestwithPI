package hunb.mutation_pi;

public class SampleController {
	
	public int sampleLogic(int a, int b) {
		
		int result = 0;
		
		if(a < 2 && a + b != 0) {
			
			//result = (a + b) * -1;
			
			result = Math.negateExact((a + b));
			
		} else {
			
			result = a + b;
			
		}
		
		return result;
		
	}
}
