import org.example.zadanie6.ru.netology.sqr.SQRService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void shouldCalcSQRService() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSQRService(200, 300);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void zeroAllCalcSQRService() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSQRService(0, 0);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void zeroLimit1CalcSQRService() {
        SQRService service = new SQRService();

        int expected = 8;
        int actual = service.calcSQRService(0, 300);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void zeroLimit2CalcSQRService() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSQRService(200, 0);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinusCalcSQRService() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSQRService(-200, -300);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncorrectCalcSQRService() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSQRService(300, 200);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SquareLimitCalcSQRService() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSQRService(225, 300);
        Assertions.assertEquals(expected, actual);
    }
}

