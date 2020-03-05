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
	
	@ParameterizedTest
	@CsvSource({
		"0,	HELLO!",
		"1,	GOOD BYE!"
	})
	@Amennyiben("a csoport megszólítása {int}, a csoport válasza: {string}") 
	public void groupMessage(int m, String message) {
		assertEquals(message, group.sampleGroupMessage(m));
	}
}
