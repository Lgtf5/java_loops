package dev.lidia;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MultiplicationTableTest {

   
    
    @Test
    @DisplayName("Test 1")
    public void test1() {
        assertThat(MultiplicationTable.multiplicationTable(1), is(1));
    }
}
