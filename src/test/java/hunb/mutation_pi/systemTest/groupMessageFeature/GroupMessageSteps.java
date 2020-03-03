package hunb.mutation_pi.systemTest.groupMessageFeature;

import hunb.mutation_pi.Group;

import io.cucumber.java.hu.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class GroupMessageSteps {

	Group group;
	
	@BeforeEach
	@Adott("egy csoport")
	public void newGroup() {
		group = new Group();
	}
	
	public String message;
	@Amennyiben("a maradékos osztás értéke: {int}")
	public void groupMessage(int m) {
		message = group.sampleGroupMessage(m);
	}
	
	@Akkor("a csoport válasza: {string}")
	public void groupMessageValidate(String expectedMessage) {
		assertEquals(expectedMessage, message);
	}
	
	@Test
	public void groupMessage() {
		//group = new Integrataion();
		assertEquals("HELLO!", group.sampleGroupMessage(0));
		assertEquals("GOOD BYE!", group.sampleGroupMessage(1));
	}
}
