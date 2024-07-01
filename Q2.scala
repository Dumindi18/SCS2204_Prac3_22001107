object Filter {
  def filterStrings(input: List[String]): List[String] = {
    input.filter(_.length > 5)
  }

  def main(args: Array[String]): Unit = {
    val original = List("Scala", "programming", "is", "fun", "and", "powerful")
    val filtered = filterStrings(original)
    println(s"Original list: $original")
    println(s"Filtered list: $filtered")
  }
}