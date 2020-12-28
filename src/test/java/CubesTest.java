import static org.junit.Assert.*;
import org.junit.Test;


public class CubesTest {

    @Test
    public void test0() {
        String s = "Once upon a midnight dreary, while100 I pondered, 9026315weak and weary -827&()";
        Cubes c = new Cubes();
        assertEquals("371 407 153 1 932 Lucky", c.isSumOfCubes(s));
    }
}