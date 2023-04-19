import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.assertj.core.api.Assertions.assertThat;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class Tests {
    @Test
    @DisplayName("n = 1 : [ [1,3] ]")
    void t001() {
        assertThat(
                new ClassSolution().solution(2)
        ).isEqualTo(
                new int[][]{{1,3}}
        );
    }

    @Test
    @DisplayName("n = 2 : [ [1,2], [1,3], [2,3] ]")
    void t002() {
        assertThat(
                new ClassSolution().solution(2)
        ).isEqualTo(
                new int[][]{{1,2},{1,3},{2,3}}
        );
    }
}
