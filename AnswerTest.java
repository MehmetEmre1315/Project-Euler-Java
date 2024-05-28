import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnswerTest {
    @Test
    public void testProjectEuler001 () {assertEquals(233168, new ProjectEuler001().run());}
    @Test
    public void ProjectEuler002 () {assertEquals(4613732, new ProjectEuler002().run());}
    @Test
    public void ProjectEuler003 () {assertEquals("6857", new ProjectEuler003().run());}
}
