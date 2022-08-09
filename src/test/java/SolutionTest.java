import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void getSumExample1() {
    assertEquals(3, sol.getSum(1,2));
  }
  @Test
  void getSumExample2() {
    assertEquals(5, sol.getSum(2,3));
  }
}