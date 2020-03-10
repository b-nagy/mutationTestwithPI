package hunb.mutation_pi;

import java.util.ArrayList;
import java.util.List;

public class Group{

	private List<Person> humanList = new ArrayList<>();
	
	public String newHuman(int a, int b, String name) {	
		
		int age = new SampleController().sampleLogic(a, b);
		
		if(humanList.size() < 5) {
			humanList.add(new Person(age, name));
			return "The group size is: " + humanList.size();
		}
		return "The group is full";
	}
	
	public Person getHuman(int id) {
		if (id < 5 && id > -1) {
			return humanList.get(id);
		}
		return humanList.get(0);
	}
	
	public String removeHuman(int age, String name) {
		for(Person i : humanList) 
			if (i.getAge() == age && i.getName().equals(name)) {
				humanList.remove(i);
				return name + ":" + age + " removed from group";
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
	
	public String sampleGroupMessage(int i) {
		return new GroupMessage().greeting(i);
	}
	
}
