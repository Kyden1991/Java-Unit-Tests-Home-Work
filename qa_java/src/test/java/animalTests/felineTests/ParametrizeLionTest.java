package animalTests.felineTests;

import com.example.Animal;
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


//@RunWith(Parameterized.class)
//public class ParametrizeLionTest {
//    Feline feline = new Feline();
//    private final String setLionSex;
//    private final boolean getLionMan;
//
//    public ParametrizeLionTest(String setLionSex, boolean getLionMan) {
//        this.setLionSex = setLionSex;
//        this.getLionMan = getLionMan;
//    }
//
//    @Parameterized.Parameters
//    public static Object[][] lionSexAndMane() {
//        return new Object[][]{
//                {"Самец", true},
//                {"Самка", false}
//        };
//    }
//
//    @Test
//    public void getFoodReturnHerbivoreFood() throws Exception {
//        Lion lion = new Lion(setLionSex, feline);
//
//        assertEquals(, );
//    }
//}
