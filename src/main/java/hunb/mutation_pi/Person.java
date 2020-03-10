package hunb.mutation_pi;

public class Person {

	private int age;
	private String name;
	
	public Person(int age, String name) {
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
		if(age < 0 ) { return "I was not born.";}
		if(age == 0 ) { return "I'm now being born.";}
		if(age <= 11 && age >= 1) { return "I'm a child."; }
		if(age <= 17 && age >= 12) { return "I'm a young."; }
		if(age <= 39 && age >= 18) { return "I'm middle aged."; }
		if(age <= 59 && age >= 40) { return "I'm old."; }
		return "I'm older."; 	
	}
	
	public String greeting(String voice) {
		
		String backGreeting = (
				(voice.toLowerCase().contains("hi")
				||
				voice.toLowerCase().contains("hello"))
				&& 
				voice.contains(this.name)) ? "Hello!" : "no answer";
		
		if(backGreeting.equals("no answer")) {	
			backGreeting = (voice.equals(this.name + "?")) ? "Yes, i'm!" : "no answer";
		}
		if(backGreeting.equals("no answer")) {
			backGreeting = (voice.equals(this.name + "!")) ? "Yes, sir!" : "no answer";
		}
		
		
		return backGreeting;
	}
}
