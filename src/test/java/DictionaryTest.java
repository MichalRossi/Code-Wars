import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DictionaryTest {

    @Test
    public void testBerries() {
        Dictionary dictionary = new Dictionary(new String[]{"strawberry","cherry", "pineapple", "melon",  "raspberry"});
        assertEquals("strawberry", dictionary.findMostSimilar("strawbery"));
        assertEquals("cherry", dictionary.findMostSimilar("berry"));
    }

    @Test
    public void testLanguages() {
        Dictionary dictionary = new Dictionary(new String[]{"javascript", "java", "ruby", "php", "python", "coffeescript"});
        assertEquals("java", dictionary.findMostSimilar("heaven"));
        assertEquals("javascript", dictionary.findMostSimilar("javascript"));
    }

}