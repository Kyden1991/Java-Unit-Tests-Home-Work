package animalTests;

import com.example.Animal;
import com.example.Lion;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ObjectInputStream;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class AnimalTest {

    @Before
    public void init (){
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Mock
    Animal animal;

    @Test
    public void getFoodTravoiadnoeReturnListOfFood() throws Exception {
        List<String> expected = List.of("Трава", "Различные растения");
//        animal.getFood("Травоядное");
//        Mockito.verify(animal).getFood("Травоядное");
        Mockito.when(animal.getFood("Травоядное")).thenReturn(expected);
        assertEquals(List.of("Трава", "Различные растения"), animal.getFood("Травоядное"));
    }

    @Test
    public void getFoodHischnikReturnListOfFood() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        doReturn(expected).when(animal).getFood("Хищник");
        assertEquals(expected, animal.getFood("Хищник"));
    }

    @Test
    public void getFamily() {
    }
}