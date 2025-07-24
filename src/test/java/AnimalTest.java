import com.example.Animal;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    private final Animal animal = new Animal();

    @Test
    void testGetFamily() {
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи",
                animal.getFamily());
    }

    @Test
    void testGetFoodForHerbivore() throws Exception {
        assertEquals(List.of("Трава", "Различные растения"), animal.getFood("Травоядное"));
    }

    @Test
    void testGetFoodForPredator() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), animal.getFood("Хищник"));
    }

    @Test
    void testGetFoodForUnknownType() {
        Exception exception = assertThrows(Exception.class, () -> animal.getFood("Неизвестный"));
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
    }
}
