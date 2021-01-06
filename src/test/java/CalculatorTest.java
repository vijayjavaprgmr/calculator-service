import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import com.bnpp.kata.Calculator;

import static org.hamcrest.Matchers.equalTo;

public class CalculatorTest {

	@Test
	public void additionTest() {
		assertThat(Calculator.addition(5, 5), is(equalTo(10)));
	}

	@Test
	public void subtractionTest() {
		assertThat(Calculator.subtraction(5, 5), is(equalTo(0)));
	}

	@Test
	public void multiplicationTest() {
		assertThat(Calculator.multiplication(5, 5), is(equalTo(25)));
	}

	@Test
	public void divisionTest() {
		assertThat(Calculator.division(5, 5), is(equalTo(1)));
	}

}
