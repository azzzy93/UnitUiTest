package kg.geektech.unituitest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathTest {

    Math math;

    @Before
    public void setUp(){
        math = new Math();
        System.out.println("Before");
    }

    @Test
    public void simpleMathCase(){
        assertEquals("6", math.add("3","3"));
        assertEquals("0", math.sub("3","3"));
        assertEquals("9", math.mult("3","3"));
        assertEquals("1", math.div("3","3"));
        System.out.println("simpleMathCase");
    }

    @Test
    public void simpleNegativeMathCase(){
        assertEquals("0", math.add("-3","3"));
        assertEquals("-6", math.sub("-3","3"));
        assertEquals("-9", math.mult("-3","3"));
        assertEquals("-1", math.div("-3","3"));
        System.out.println("simpleNegativeMathCase");
    }

    @Test
    public void emptyOneFieldCase(){
        assertEquals("3", math.add("","3"));
        assertEquals("-3", math.sub("","3"));
        assertEquals("0", math.mult("","3"));
        assertEquals("0", math.div("","3"));
        System.out.println("emptyOneFieldCase");
    }

    @Test
    public void emptyTwoFieldCase(){
        assertEquals("0", math.add("",""));
        assertEquals("0", math.sub("",""));
        assertEquals("0", math.mult("",""));
        assertEquals("Нельзя делить на ноль", math.div("",""));
        System.out.println("emptyTwoFieldCase");
    }

    @Test
    public void charFieldMathCase(){
        assertEquals("Введите цифры", math.add("a","dw"));
        assertEquals("Введите цифры", math.sub("a","dw"));
        assertEquals("Введите цифры", math.mult("a","dw"));
        assertEquals("Введите цифры", math.div("a","dw"));
        System.out.println("charFieldMathCase");
    }

    @Test
    public void withSpaceMathCase(){
        assertEquals("6", math.add("   3 ","   3  "));
        assertEquals("0", math.sub("   3 ","   3  "));
        assertEquals("9", math.mult("   3 ","   3  "));
        assertEquals("1", math.div("   3 ","   3  "));
        System.out.println("withSpaceMathCase");
    }

    @Test
    public void divByZero(){
        assertEquals("4", math.add("4","0"));
        assertEquals("4", math.sub("4","0"));
        assertEquals("0", math.mult("4","0"));
        assertEquals("Нельзя делить на ноль", math.div("4","0"));
        System.out.println("charFieldAddCase");
    }

    @Test
    public void twoWordsReverseCase(){
        assertEquals("World Hello", math.reverseWords("Hello World"));
    }

    @Test
    public void threeAndMoreWordsReverseCase(){
        assertEquals("Four Three Two One", math.reverseWords("One Two Three Four"));
    }

    @After
    public void tearDown(){
        math = null;
        System.out.println("After");
    }
}
