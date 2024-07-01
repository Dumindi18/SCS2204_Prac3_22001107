object ReverseString {
  def reverse(input: String): String = {
    if (input.isEmpty) ""
    else reverse(input.tail) + input.head
  }

  def main(args: Array[String]): Unit = {
    val original = "Hello, World!"
    val reversed = reverse(original)
    println(s"Original: $original")
    println(s"Reversed: $reversed")
  }
}