package hunb.mutation_pi.systemTest.groupMessageFeature;

import hunb.mutation_pi.Group;

import io.cucumber.java.hu.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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
	
	@ParameterizedTest
	@CsvSource({
		"HELLO!,	0",
		"GOOD BYE!,	1"
	})
	public void groupMessage(String message, int i) {
		//group = new Integrataion();
		assertEquals(message, group.sampleGroupMessage(i));
	}
}
