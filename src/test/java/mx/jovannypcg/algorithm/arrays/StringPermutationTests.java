package mx.jovannypcg.algorithm.arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class StringPermutationTests {
    private String target = "arroz";

    private String validMatch1 = "zorra";
    private String validMatch2 = "rroza";
    private String validMatch3 = "aozrr";

    private String invalidMatch1 = "zrryi";
    private String invalidMatch2 = "romaz";
    private String invalidMatch3 = "azort";

    @Test
    public void perform_withArray_shouldReturnTrue() {
        assertThat(StringPermutation.perform_withArray(target, validMatch1)).isTrue();
        assertThat(StringPermutation.perform_withArray(target, validMatch2)).isTrue();
        assertThat(StringPermutation.perform_withArray(target, validMatch3)).isTrue();
    }

    @Test
    public void perform_shouldReturnFalseDueToLength() {
        String invalidLengthMatch = "zorrra";

        assertThat(StringPermutation.perform_withArray(target, invalidLengthMatch)).isFalse();
        assertThat(StringPermutation.perform_withMap(target, invalidLengthMatch)).isFalse();
    }

    @Test
    public void perform_withArray_shouldReturnFalse() {
        assertThat(StringPermutation.perform_withArray(target, invalidMatch1)).isFalse();
        assertThat(StringPermutation.perform_withArray(target, invalidMatch2)).isFalse();
        assertThat(StringPermutation.perform_withArray(target, invalidMatch3)).isFalse();
    }



    @Test
    public void perform_withMap_shouldReturnTrue() {
        assertThat(StringPermutation.perform_withMap(target, validMatch1)).isTrue();
        assertThat(StringPermutation.perform_withMap(target, validMatch2)).isTrue();
        assertThat(StringPermutation.perform_withMap(target, validMatch3)).isTrue();
    }

    @Test
    public void perform_withMap_shouldReturnFalse() {
        assertThat(StringPermutation.perform_withMap(target, invalidMatch1)).isFalse();
        assertThat(StringPermutation.perform_withMap(target, invalidMatch2)).isFalse();
        assertThat(StringPermutation.perform_withMap(target, invalidMatch3)).isFalse();
    }
}
