import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Giorgi on 5/8/2016.
 */

public class TestAddition {

    @Test
    public void add_ZeroPlusOne_ReturnesOne(){
        Addition addition = new Addition();
        assertEquals(1, addition.add(0, 1));
    }
}
