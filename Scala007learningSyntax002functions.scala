import scala.io.StdIn.readLine
object Main {
  def main(args: Array[String]): Unit = {
    println("add(5,6) = " + add(5,6))
    println("mult(5,6) = " + mult(5,6))
    println("mult(5) = " + mult(5))
    println("mult() = " + mult())
  }

  // function to add two numbers
  def add(x: Int, y: Int): Int = {
    return x + y
  }

  // function to multiply two numbers, but with default parameters
  def mult(x: Int = 1, y: Int = 1): Int = {
    return x*y
  }
}