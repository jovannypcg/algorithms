package mx.jovannypcg.algorithm.arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UniqueCharactersTests {
    @Test
    public void isUnique_withArray_shouldBeTrue() {
        String validString1 = "abcdefghijklmnopqrstuvwxyz";
        String validString2 = "this name";
        String validString3 = "pqoeifkalhtuy";

        assertThat(UniqueCharacters.isUnique_withArray(validString1)).isTrue();
        assertThat(UniqueCharacters.isUnique_withArray(validString2)).isTrue();
        assertThat(UniqueCharacters.isUnique_withArray(validString3)).isTrue();
    }

    @Test
    public void isUnique_withArray_shouldBeFalse() {
        String invalidString1 = "abcdefghijklmnopqrstuvwxyza";
        String invalidString2 = "this name is not nice";
        String invalidString3 = "pqoeifkalhtuyyyy";

        assertThat(UniqueCharacters.isUnique_withArray(invalidString1)).isFalse();
        assertThat(UniqueCharacters.isUnique_withArray(invalidString2)).isFalse();
        assertThat(UniqueCharacters.isUnique_withArray(invalidString3)).isFalse();
    }
}
