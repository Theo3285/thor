import com.codingame.Thor;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class ThorShould {

    private Thor thor;

    @Before
    public void initialise() {
        thor = new Thor(3, 3);
    }

    @Test
    @Parameters({
            "3, 4, S"
    })
    public void turn_south(int lightX, int lightY, String position) {
        assertThat(thor.moves(lightX, lightY), is(position));
    }

    @Test
    @Parameters({
            "4, 3, E"
    })
    public void turn_east(int lightX, int lightY, String position) {
        assertThat(thor.moves(lightX, lightY), is(position));
    }

    @Test
    @Parameters({
            "3, 2, N"
    })
    public void turn_north(int lightX, int lightY, String position) {
        assertThat(thor.moves(lightX, lightY), is(position));
    }

    @Test
    @Parameters({
            "2, 3, O"
    })
    public void turn_ouest(int lightX, int lightY, String position) {
        assertThat(thor.moves(lightX, lightY), is(position));
    }
}
