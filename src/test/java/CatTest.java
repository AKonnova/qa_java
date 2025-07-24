import com.example.Cat;
import com.example.Predator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CatTest {
    @Mock
    private Predator predator;

    @Test
    void testGetSound() {
        Cat cat = new Cat(predator);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    void testGetFood() throws Exception {
        Cat cat = new Cat(predator);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        when(predator.eatMeat()).thenReturn(expectedFood);

        assertEquals(expectedFood, cat.getFood());
        verify(predator, times(1)).eatMeat();
    }
}