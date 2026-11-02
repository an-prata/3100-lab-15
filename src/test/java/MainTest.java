import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.Main.hypothenuse;

public class MainTest {
    @Test
    void hypothenuseTest() {
        Assertions.assertEquals(22.36068, hypothenuse(10, 20), 0.001);
    }
}
