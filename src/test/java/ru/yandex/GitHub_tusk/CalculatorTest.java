package ru.yandex.GitHub_tusk;
import  org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CalculatorTest {
    private final int firstNumber;
    private final int secondNumber;
    private final int expected;
    public CalculatorTest(int firstNumber, int secondNumber, int expected) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Object [][] getTestData(){
        return new Object[][] {
            {23, 33, 56},
            {11, 22, 33},
            {1, 2, 3},
        };

    }
    @Test
    public void shouldBeSum() {
        Calculator calculator = new Calculator();
        int actual = calculator.sum(firstNumber, secondNumber);
        assertEquals("Результат должен быть положительным, а вычисления корректными", expected, actual);
    }

}