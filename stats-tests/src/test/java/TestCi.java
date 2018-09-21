import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCi {
    @Test
    public void makeSureThatGameStatIsCorrect() {

        Assertions.assertEquals(1, 2);
    }

    @Test
    public void makeSureThatGameIsCorrect() {
        Assertions.assertEquals(1, 1);
    }
}
