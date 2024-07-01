object Mean {
  def findMean(num1: Int, num2: Int): Double = {
    val average = (num1 + num2) / 2.0
    BigDecimal(average).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  def main(args: Array[String]): Unit = {
    val num1 = 32
    val num2 = 17
    val result = findMean(num1, num2)
    println(s"The mean of $num1 and $num2 is $result")
  }
}