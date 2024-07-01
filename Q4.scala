object EvenNumberSum {
  def sumEvenNumbers(input: List[Int]): Int = {
    input.filter(_ % 2 == 0).sum
  }

  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val sumOfEvens = sumEvenNumbers(numbers)
    println(s"The sum of all even numbers in the list is: $sumOfEvens")
  }
}