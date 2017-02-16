import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.never;

public class LifeTest {
    @Mock Environment environment;
    @InjectMocks Life life;

    @Before
    public void setUp() throws Throwable {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void givenOnlyDeadCells_whenLifeCycle_thenAllCellsShouldRemainDead() throws Throwable {
        // given
        given(environment.isCellAliveAt(any(Coordinate.class))).willReturn(false);

        // when
        life.cycle();

        // then
        then(environment).should(never()).revive(any(Coordinate.class));
    }
}