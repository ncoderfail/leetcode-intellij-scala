object Solution {
  def runningSum(nums: Array[Int]): Array[Int] = {
    var result = Vector[Int](nums(0))
    for (num <- nums.slice(1, nums.length)) {
      result = result :+ num + result.last
    }
    result.toArray
  }
}
