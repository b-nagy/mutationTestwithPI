package repoUnitTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import hunb.mutation_pi.Person;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

	Person Viki = new Person(12, "Viki");
	
	@DisplayName("Add human: Viki, 12")
	@Test
	public void newHumanTest() {
		assertEquals("Viki", Viki.getName());
		assertEquals(12, Viki.getAge());
	}
	
//	@DisplayName("Change age")
//	@Test
//	public void setAgeTest() {
//		Viki.setAge(13);
//		assertEquals(13, Viki.getAge());
//	}
	
	@DisplayName("Change name")
	@Test
	public void setNameTest() {
		Viki.setName("Viktória");
		assertEquals("Viktória", Viki.getName());
	}
	
	@DisplayName("Answer: I was not born.")
	@Test
	public void howOldAreYouTest1() {
		Viki.setAge(-1);
		assertEquals("I was not born.", Viki.howOldAreYou());
	}
	
	@DisplayName("Answer: I'm now being born.")
	@Test
	public void howOldAreYouTest2() {
		Viki.setAge(0);
		assertEquals("I'm now being born.", Viki.howOldAreYou());
	}
	
	@DisplayName("Answer: I'm a child.")
	@Test
	public void howOldAreYouTest3() {
		Viki.setAge(1);
		assertEquals("I'm a child.", Viki.howOldAreYou());
		Viki.setAge(11);
		assertEquals("I'm a child.", Viki.howOldAreYou());
	}
	
	@DisplayName("Answer: I'm a young.")
	@Test
	public void howOldAreYouTest4() {
		Viki.setAge(12);
		assertEquals("I'm a young.", Viki.howOldAreYou());
		Viki.setAge(17);
		assertEquals("I'm a young.", Viki.howOldAreYou());
	}
	
	@DisplayName("Answer: I'm middle aged.")
	@Test
	public void howOldAreYouTest5() {
		Viki.setAge(18);
		assertEquals("I'm middle aged.", Viki.howOldAreYou());
		Viki.setAge(39);
		assertEquals("I'm middle aged.", Viki.howOldAreYou());
	}
	
	@DisplayName("Answer: I'm old.")
	@Test
	public void howOldAreYouTest6() {
		Viki.setAge(40);
		assertEquals("I'm old.", Viki.howOldAreYou());
		Viki.setAge(59);
		assertEquals("I'm old.", Viki.howOldAreYou());
	}
	
	@DisplayName("Answer: I'm older.")
	@Test
	public void howOldAreYouTest7() {
		Viki.setAge(60);
		assertEquals("I'm older.", Viki.howOldAreYou());
	}
	
	@DisplayName("Greeting: Hello!")
	@Test
	public void greetingHello() {	
		assertEquals("Hello!", Viki.greeting("Hello Viki!"));
		assertEquals("Hello!", Viki.greeting("Hi! how are you Viki?"));		
	}
	
	@DisplayName("Greeting: Yes, i'm!")
	@Test
	public void greetingIm() {	
		assertEquals("Yes, i'm!", Viki.greeting("Viki?"));
	}
	
	@DisplayName("Greeting: Yes, sir!")
	@Test
	public void greetingImSir() {	
		assertEquals("Yes, sir!", Viki.greeting("Viki!"));
	}
	
	@DisplayName("Greeting: no answer")
	@Test
	public void noAnswer() {	
		assertEquals("no answer", Viki.greeting("Hello!"));
		assertEquals("no answer", Viki.greeting("hi!?"));
	}
	
}
