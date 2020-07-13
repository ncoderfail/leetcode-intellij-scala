import org.scalatest.funsuite.AnyFunSuite

class SolutionSpec extends AnyFunSuite {
  test("test") {
    val testCases = List(
      (Array(1), Array(1)),
      (Array(1, 2, 2), Array(1, 1, 0)),
    )

    for {
      (expected, input) <- testCases
      result = Solution.runningSum(input)
    } yield assertResult(expected)(result)
  }
}