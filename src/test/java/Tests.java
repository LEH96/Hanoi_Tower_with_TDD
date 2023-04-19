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
                new Hanoi(1, 3, 1).toArray()
        ).isEqualTo(
                new int[][]{{1,3}}
        );
    }

    @Test
    @DisplayName("n = 2 : [ [1,2], [1,3], [2,3] ]")
    void t002() {
        assertThat(
                new Hanoi(2, 1, 3).toArray()
        ).isEqualTo(
                new int[][]{{1,2},{1,3},{2,3}}
        );
    }

    @Test
    @DisplayName("from = 1, to = 2 가정 , n = 2 : [ [1,3], [1,2], [3,2] ]")
    void t003() {
        assertThat(
                new Hanoi(2, 1, 2).toArray()
        ).isEqualTo(
                new int[][]{{1,3},{1,2},{3,2}}
        );
    }


}
