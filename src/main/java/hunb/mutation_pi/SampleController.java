package hunb.mutation_pi;

public class SampleController {
	
	public int sampleLogic(int a, int b) {
		if(a < 2 && a + b != 0) 
			return Math.negateExact((a + b)); //result = (a + b) * -1;
		 else 
			return a + b;
	}
}
