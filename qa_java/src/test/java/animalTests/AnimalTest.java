package animalTests;

import com.example.Animal;
import com.example.Lion;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ObjectInputStream;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;

public class AnimalTest {
    @Test
    public void getFoodReturnHerbivoreFood() throws Exception {
        Animal animal = new Animal();
        List<String> actualListOfFood = animal.getFood("Травоядное");
        List<String> expectedListOfFood = List.of("Трава", "Различные растения");

        assertEquals(expectedListOfFood, actualListOfFood);
    }

    @Test
    public void getFoodReturnPredatorFood() throws Exception {
        Animal animal = new Animal();
        List<String> actualListOfFood = animal.getFood("Хищник");
        List<String> expectedListOfFood = List.of("Животные", "Птицы", "Рыба");

        assertEquals(expectedListOfFood, actualListOfFood);
    }

    @Test
    public void getFamilyReturnStringOfFamilies() {
        Animal animal = new Animal();
        String actual = animal.getFamily();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";

        assertEquals(expected, actual);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void getFoodInvalidDataReturnError() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Неизвестный вид животного, используйте значение Травоядное или Хищник");

        Animal animal = new Animal();
        animal.getFood("dfdfdf");
    }
}