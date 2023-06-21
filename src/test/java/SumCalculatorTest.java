import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {
    private SumCalculator sc;
    @BeforeEach
    public void beforeEach() {
        sc = new SumCalculator();
    }
    @Test
    public void testSumWorksCorrectWith1() {
        //When
        int actual = sc.sum(1);
        //Then
        int expected = 1;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testSumWorksCorrectWith3() {
        //When
        int actual = sc.sum(3);
        //Then
        int expected = 6;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testSumWorksCorrectWith0() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            sc.sum(0);
        });
    }
}
