import org.scalatest.funsuite.AnyFunSuite

class SolutionSpec extends AnyFunSuite {
  test("test") {
    val testCases = List(
      (Array(1, 2, 2), Array(1, 1, 0))
    )

    for ((expected, input) <- testCases) {
      assertResult(expected)(Solution.runningSum(input))
    }
  }
}