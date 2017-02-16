import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class CellTest {

    @Test
    @Parameters(method = "parameters")
    public void givenNewCell_thenShouldHaveStatus(CellStatus status, boolean expected)
        throws Throwable {
        // given
        Cell cell = new Cell(status);

        // then
        assertThat(cell.isAlive()).isEqualTo(expected);
    }

    @Test
    public void givenAliveCell_whenKill_thenShouldBeDead() throws Throwable {
        // given
        Cell cell = new Cell(CellStatus.ALIVE);

        // when
        cell.kill();

        // then
        assertThat(cell.isAlive()).isFalse();
    }

    @Test
    public void givenDeadCell_whenRevive_thenShouldBeAlive() throws Throwable {
        // given
        Cell cell = new Cell(CellStatus.DEAD);

        // given
        cell.kill();

        // when
        cell.revive();

        // then
        assertThat(cell.isAlive()).isTrue();
    }

    private Object[] parameters() {
        return new Object[]{
            new Object[]{CellStatus.ALIVE, true},
            new Object[]{CellStatus.DEAD, false},
        };
    }
}
