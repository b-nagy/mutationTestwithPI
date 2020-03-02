package hunb.mutation_pi;

import java.util.ArrayList;
import java.util.List;

public class Integrataion{

	private List<Human> humanList = new ArrayList<>();
	
	public String newHuman(int a, int b, String name) {	
		
		int age = new SampleController().sampleLogic(a, b);
		
		if(humanList.size() < 5) {
			humanList.add(new Human(age, name));
			return "The group size is: " + humanList.size();
		}
		return "The group is full";
	}
	
	public Human getHuman(int id) {
		if (id < 5 && id > -1) {
			return humanList.get(id);
		} 
		return humanList.get(0);
	}
	
	public String removeHuman(int age, String name) {
		for (int i = 0; i < humanList.size(); i++) {
			if (humanList.get(i).getAge() == age && humanList.get(i).getName().equals(name)) {
				humanList.remove(i);
				return name + ":" + age + " removed from group";
			}
		}
		return name + ":" + age + " is not in the group";
	}
	
	public int clearGroup() {
		humanList.clear();
		return humanList.size();
	}
	
	public int getSize() {
		return humanList.size();
	}
	
}
