import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.Boolean.TRUE;
import static org.assertj.core.api.Assertions.assertThat;

public class EnvironmentTest {

    @Test
    public void givenNewEnvironment_thenCellsShouldBeDead() throws Throwable {
        // given
        ArrayList<ArrayList<Boolean>> grid = new ArrayList<>();
        Environment environment = new Environment(grid);

        // then
        Absciss absciss = Absciss.of(0);
        Ordinate ordinate = Ordinate.of(0);
        Coordinate coordinate = Coordinate.of(absciss, ordinate);
        assertThat(environment.isCellAliveAt(coordinate)).isFalse();
    }

    @Test
    public void givenNewEnvironmentWithLiveCell_thenCellShouldBeAlive() throws Throwable {
        // given
        ArrayList<ArrayList<Boolean>> grid = new ArrayList<>(Arrays.asList(
            new ArrayList<>(Collections.emptyList()),
            new ArrayList<>(Collections.singletonList(TRUE)),
            new ArrayList<>(Collections.emptyList())
        ));
        Environment environment = new Environment(grid);

        // when
        Absciss absciss = Absciss.of(0);
        Ordinate ordinate = Ordinate.of(1);
        Coordinate coordinate = Coordinate.of(absciss, ordinate);
        boolean cellAliveAt = environment.isCellAliveAt(coordinate);

        // then
        assertThat(cellAliveAt).isTrue();
    }
}