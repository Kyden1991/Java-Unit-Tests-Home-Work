package animalTests.felineTests;

import com.example.Animal;
import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void getSoundReturnMeow() {
        Cat cat = new Cat(feline);
        String actualSound = cat.getSound();
        String expectedSound = "Мяу";

        assertEquals(expectedSound, actualSound);
    }

    @Test
    public void getFoodReturnPredatorsFood() throws Exception {
        Cat cat = new Cat(feline);
        cat.getFood();
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        List<String> catFoodActual = feline.getFood("Хищник");
        List<String> catFoodExpected = List.of("Животные", "Птицы", "Рыба");

        assertEquals(catFoodExpected, catFoodActual);
    }
}