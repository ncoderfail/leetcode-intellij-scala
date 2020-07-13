import org.junit.jupiter.api.Test;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionJavaTest {
    private final SolutionJava solution = new SolutionJava();

    @Test
    void solutionJavaTest() {
        List<AbstractMap.SimpleEntry<int[], int[]>> testCases = Arrays.asList(
                new AbstractMap.SimpleEntry<>(new int[]{1}, new int[]{1}),
                new AbstractMap.SimpleEntry<>(new int[]{1, 2, 2}, new int[]{1, 1, 0})
        );

        for (AbstractMap.SimpleEntry<int[], int[]> testCase : testCases) {
            int[] expected = testCase.getKey();
            int[] actual = solution.runningSum(testCase.getValue());
            assertArrayEquals(expected, actual);
        }
    }
}