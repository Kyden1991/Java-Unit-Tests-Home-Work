package animalTests.felineTests;

import com.example.Animal;
import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

//    @Test
//    public void getLionKittens() throws Exception {
//        Lion lion = new Lion("Самец", feline);
//        int actualKittens = lion.getKittens();
//        int expectedKittens = 1;
//
//        assertEquals(expectedKittens, actualKittens);
//    }

    @Test
    public void doesLionHaveMane() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean actualMane = lion.doesHaveMane();
        boolean expectedMane = true;

        assertEquals(expectedMane, actualMane);
    }
    @Test
    public void lionDoesNotHaveMane() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean actualMane = lion.doesHaveMane();
        boolean expectedMane = false;

        assertEquals(expectedMane, actualMane);
    }
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void errorMessageWithInvalidLionSex() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Используйте допустимые значения пола животного - самец или самка");

        new Lion("dfdfdf", feline);
    }

    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        List<String> lionFoodActual = lion.getFood();
        List<String> lionFoodExpected = List.of("Животные", "Птицы", "Рыба");

        assertEquals(lionFoodExpected, lionFoodActual);
    }
}