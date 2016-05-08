import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.spy;

/**
 * Created by Giorgi on 5/8/2016.
 */

public class TestAddition {

    private Addition addition;

    @Before
    public void setup(){
        addition = new Addition();
    }

    @Test
    public void add_ZeroPlusOne_ReturnesOne(){
        assertEquals(1, addition.add(0, 1));
    }

    @Test
    public void add_OnePlusOnePlusOne_ReturnesThree(){
        Addition additionMock = spy(addition);
        assertEquals(3, additionMock.add(1, 1, 1));
    }
}
