package dev.lidia;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MultiplicationTableTest {

    MultiplicationTable table = new MultiplicationTable(); 

    @Test
    @DisplayName("Test multiplicationTable")
    public void testMultiplicationTable() {
        int number = 2;
        String resultTable = "2 x 1 = 2/n" +
                            "2 x 2 = 4/n" +
                            "2 x 3 = 6/n" +
                            "2 x 4 = 8/n" +
                            "2 x 5 = 10/n" +
                            "2 x 6 = 12/n" +
                            "2 x 7 = 14/n" +
                            "2 x 8 = 16/n" +
                            "2 x 9 = 18/n" +
                            "2 x 10 = 20/n";

        String result = table.multiplicationTable(number);
        assertThat(result, is(resultTable));     
    }
}
