package dev.lidia;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MultiplicationTableTest {
    
    @Test
    @DisplayName("Test 1")
    public void test1() {
        assertThat(MultiplicationTable.multiplicationTable(1), is(1));
    }
}
