import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.assertj.core.api.Assertions.assertThat;

public class GridLineTest {

    @Test
    public void givenNewLine_thenCellsShouldBeDead() throws Throwable {
        // given
        ArrayList<Boolean> line = new ArrayList<>();
        GridLine gridLine = new GridLine(line);

        // when
        boolean isCellALiveAt = gridLine.isCellAliveAt(Absciss.of(0));

        // then
        assertThat(isCellALiveAt).isFalse();
    }

    @Test
    public void givenNewLineWithLiveCell_thenCellShouldBeAlive() throws Throwable {
        // given
        ArrayList<Boolean> line = new ArrayList<>(Collections.singleton(TRUE));
        GridLine gridLine = new GridLine(line);

        // when
        boolean cellAliveAt = gridLine.isCellAliveAt(Absciss.of(0));

        // then
        assertThat(cellAliveAt).isTrue();
    }

    @Test
    public void givenNewLineWithCells_thenCellsShouldHaveCorrectStatus() throws Throwable {
        // given
        ArrayList<Boolean> line = new ArrayList<>(Arrays.asList(FALSE, TRUE, TRUE, FALSE, FALSE));
        GridLine gridLine = new GridLine(line);

        // then
        assertThat(gridLine.isCellAliveAt(Absciss.of(0))).isFalse();
        assertThat(gridLine.isCellAliveAt(Absciss.of(1))).isTrue();
        assertThat(gridLine.isCellAliveAt(Absciss.of(2))).isTrue();
        assertThat(gridLine.isCellAliveAt(Absciss.of(3))).isFalse();
        assertThat(gridLine.isCellAliveAt(Absciss.of(4))).isFalse();
    }

    @Test
    public void givenDeadCell_whenReviveAt_thenCellShouldBeAlive() throws Throwable {
        // given
        ArrayList<Boolean> statuses = new ArrayList<>(Collections.singletonList(FALSE));
        GridLine gridLine = new GridLine(statuses);

        // when

        // then
    }

}