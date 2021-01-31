import java.util.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BinaryTreeSortTest {
    @Test
    public void nullTest() {
        assertEquals(Arrays.asList(), BinaryTreeSort.treeByLevels(null));
    }

    @Test
    public void basicTest() {
        assertEquals(Arrays.asList(1,2,3,4,5,6), BinaryTreeSort.treeByLevels(new Node(new Node(null, new Node(null, null, 4), 2), new Node(new Node(null, null, 5), new Node(null, null, 6), 3), 1)));
    }
}