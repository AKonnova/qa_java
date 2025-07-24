import com.example.Feline;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ParametrizedFelineTest {
    private final Feline feline = new Feline();

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 3, 5})
    void testGetKittensWithCount(int count) {
        assertEquals(count, feline.getKittens(count));
    }
}