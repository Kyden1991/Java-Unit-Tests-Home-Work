package animalTests.felineTests;

import com.example.Animal;
import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FelineTest {
    private final int setKittens;
    private final int resKittens;

    public FelineTest(int setKittens, int resKittens) {
        this.setKittens = setKittens;
        this.resKittens = resKittens;
    }

    @Parameterized.Parameters
    public static Object[][] setKittens() {
        return new Object[][]{
                {0, 0},
                {5, 5},
                {2147483647, 2147483647}
        };
    }

    @Test
    public void eatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> actualFelineFood = feline.eatMeat();
        List<String> expectedFelineFood = List.of("Животные", "Птицы", "Рыба");

        assertEquals(expectedFelineFood, actualFelineFood);
    }

    @Test
    public void getFamily() {
        Feline family = new Feline();
        String actual = family.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensWithDiffParameters() {
        Feline feline = new Feline();
        int actualCountOfKittens = feline.getKittens(setKittens);

        assertEquals(resKittens, actualCountOfKittens);
    }

    @Test
    public void getKittensWithoutParameters() {
        Feline feline = new Feline();
        int defaultKittensCount = feline.getKittens();

        assertEquals(1, defaultKittensCount);
    }
}
