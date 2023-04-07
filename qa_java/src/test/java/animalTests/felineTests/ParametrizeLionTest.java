package animalTests.felineTests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class ParametrizeLionTest {
    private Feline feline = new Feline();
    private final String lionSex;
    private final boolean hasMane;

    public ParametrizeLionTest(String lionSex, boolean hasMane) {
        this.lionSex = lionSex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] lionSexAndMane() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }
//    @Rule
//    public ExpectedException thrown = ExpectedException.none();


    @Test
    public void lionMustHaseMane() throws Exception {
        Lion lion = new Lion(lionSex, feline);
        boolean hasLionManeValue = lion.doesHaveMane();

        assertEquals(hasMane, hasLionManeValue);
    }
}
