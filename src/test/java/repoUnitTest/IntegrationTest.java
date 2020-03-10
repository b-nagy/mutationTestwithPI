package repoUnitTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import hunb.mutation_pi.Group;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Group TestSuite")
public class IntegrationTest {
	
	Group group = new Group();
	
	@DisplayName("Human attribution check")
	@Test
	public void newAttributionCheck() {
		assertEquals(0, group.clearGroup());
		assertEquals("The group size is: 1", group.newHuman(2, 0, "Wiki"));
		assertEquals(group.getHuman(0).getAge(), 2);
		assertEquals(group.getHuman(0).getName(), "Wiki");
		assertEquals("Yes, i'm!", group.getHuman(0).greeting("Wiki?"));
		assertEquals("Yes, sir!", group.getHuman(0).greeting("Wiki!"));
		assertEquals("I'm a child.", group.getHuman(0).howOldAreYou());
	}
	
	@DisplayName("Human add to group")
	@Test
	public void newHumanWithSampleController() {
		assertEquals(0, group.clearGroup());
		assertEquals("The group size is: 1", group.newHuman(2, 0, "Wiki"));
	}

	@DisplayName("Human remove from group")
	@Test
	public void removeHuman() {
		assertEquals(0, group.clearGroup());
		assertEquals("The group size is: 1", group.newHuman(2, 0, "Wiki"));
		assertEquals("Wiki:2 removed from group", group.removeHuman(2, "Wiki"));
	}
	
	@DisplayName("Human group is full")
	@Test
	public void groupIsFull() {
		assertEquals(0, group.clearGroup());
		for (int i = 0; i < 5; i++) { assertEquals("The group size is: " + (i+1), group.newHuman(2, 0, "Wiki")); }
		assertEquals("The group is full", group.newHuman(2, 0, "Wiki"));
	}
	
	@DisplayName("Invalid get human")
	@Test
	public void invalidGetHuman() {
		assertEquals(0, group.clearGroup());
		assertEquals("The group size is: 1", group.newHuman(2, 0, "Wiki"));
		assertEquals(group.getHuman(0), group.getHuman(5));
		assertEquals(group.getHuman(0), group.getHuman(-1));
	}
	
	@DisplayName("isNotInTheGroup")
	@Test
	public void isNotInTheGroup() {
		assertEquals("Adam:10 is not in the group", group.removeHuman(10, "Adam"));
	}
	
	@DisplayName("clear group")
	@Test
	public void clearGroup() {
		assertEquals("The group size is: 1", group.newHuman(2, 0, "Wiki"));
		assertEquals(0, group.clearGroup());
	}
	
	@DisplayName("get group size")
	@Test
	public void getGroupSize() {
		group.clearGroup();
		assertEquals(0, group.getSize());
		group.newHuman(2, 0, "Wiki");
		assertEquals(1, group.getSize());
	}
	
	@DisplayName("Group Message")
	@ParameterizedTest
	@CsvSource({
		"0,	HELLO!",
		"1,	GOOD BYE!"
	})
	public void groupMessage(int m, String message) {
		assertEquals(message, group.sampleGroupMessage(m));
	}
	
}
