package hunb.mutation_pi;

public class Human {

	private int age;
	private String name;
	
	public Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public String howOldAreYou() {
		
		String answer = "";
		
		if(age <= -1 ) { answer = "I was not born.";}
		if(age == 0 ) { answer = "I'm now being born.";}
		if(age <= 11 && age >= 1) { answer = "I'm a child."; }
		if(age <= 17 && age >= 12) { answer = "I'm a young."; }
		if(age <= 39 && age >= 18) { answer = "I'm middle aged."; }
		if(age <= 59 && age >= 40) { answer = "I'm old."; }
		if(age > 59) { answer = "I'm older."; }
		
		return answer;
	}
}
