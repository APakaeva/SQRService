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
}
