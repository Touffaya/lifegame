import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class CellTest {

    @Test
    @Parameters(method = "parameters")
    public void givenNewCell_thenShouldHaveStatus(Boolean isAlive, boolean expected)
        throws Throwable {
        // given
        Cell cell = new Cell(isAlive);

        // then
        assertThat(cell.isAlive()).isEqualTo(expected);
    }

    @Test
    public void givenAliveCell_whenKill_thenShouldBeDead() throws Throwable {
        // given
        Cell cell = new Cell(Boolean.TRUE);

        // when
        cell.kill();

        // then
        assertThat(cell.isAlive()).isFalse();
    }

    @Test
    public void givenDeadCell_whenRevive_thenShouldBeAlive() throws Throwable {
        // given
        Cell cell = new Cell(Boolean.FALSE);

        // when
        cell.revive();

        // then
        assertThat(cell.isAlive()).isTrue();
    }

    private Object[] parameters() {
        return new Object[]{
            new Object[]{Boolean.TRUE, true},
            new Object[]{Boolean.FALSE, false},
        };
    }
}
