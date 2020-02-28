package hunb.mutation_pi;

public class Integrataion{

	public Human newHuman(int a, int b) {
		
		int age = new SampleController().sampleLogic(a, b);
		
		Human human = new Human(age, "Valaki");
		
		return human;
	}
}
