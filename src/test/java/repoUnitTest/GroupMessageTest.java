package repoUnitTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import hunb.mutation_pi.GroupMessage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

@DisplayName("JUnit5 like BDD")
public class GroupMessageTest {
	
	GroupMessage groupMesseage;
	
	@BeforeEach
	@DisplayName("Adott a csoportos megszólítás kontroller")
	public void prepare() {
		groupMesseage = new GroupMessage();
	}
	
	@DisplayName("A megszólítástól függően HELLO!, vagy GOOD BYE! -al köszön vissza")
	@ParameterizedTest
	@CsvSource({
		"0,	HELLO!",
		"1,	GOOD BYE!",
		"2,	HELLO!"
	})
	public void sayHello1(int inValue, String returnValue) {
		assertEquals(returnValue, groupMesseage.greeting(inValue));
	}
	
//	@DisplayName("Say : GOOD BYE!")
//	@Test
//	public void sayGoodBye1() {
//		String message = new SampleController2().message(1);
//		assertEquals(message, "GOOD BYE!");
//	}

}
