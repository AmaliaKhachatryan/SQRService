import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QSRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/QSRService.csv")
    public void shouldQuantityService(int expected, int min, int max) {
        QSRService example = new QSRService();
        int actual = example.quantityService(min, max);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldQuantityServiceTest() {
        QSRService example = new QSRService();
        int expected = 0;
        int actual = example.quantityService(9801, 10000);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldQuantityService1Test() {
        QSRService example = new QSRService();
        int expected = 0;
        int actual = example.quantityService(-100, -50);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldQuantityService2Test() {
        QSRService example = new QSRService();
        int expected = 88;
        int actual = example.quantityService(100, 9801);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldQuantityService3Test() {
        QSRService example = new QSRService();
        int expected = 0;
        int actual = example.quantityService(9801, 9081);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldQuantityService4Test() {
        QSRService example = new QSRService();
        int expected = 88;
        int actual = example.quantityService(100, 9801);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldQuantityService5Test() {
        QSRService example = new QSRService();
        int expected = 1;
        int actual = example.quantityService(-100, 120);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldQuantityService6Test() {
        QSRService example = new QSRService();
        int expected = 0;
        int actual = example.quantityService(-100, -50);
        assertEquals(expected, actual);
    }


}
