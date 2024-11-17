import scala.io.StdIn.readLine
object Main {
  def main(args: Array[String]): Unit = {
    println("add(5,6) = " + add(5,6))
    println("mult(5,6) = " + mult(5,6))
    println("mult(5) = " + mult(5))
    println("mult() = " + mult())
    println("factorial(5) = " + factorial(5))
  }

  // function to add two numbers
  def add(x: Int, y: Int): Int = {
    return x + y
  }

  // function to multiply two numbers, but with default parameters
  def mult(x: Int = 1, y: Int = 1): Int = {
    return x*y
  }

  // one-liner function
  def factorial(x: Int = 1): Int = if(x==0) 1 else x*factorial(x-1)

//  Every value is an object and every operation is a method call.
//  For example, when you say 1 + 2 in Scala, you are actually invoking a method named + defined in class Int

// a function is REFERENTIALLY TRANSPARENT if you can replace the function call with it's equivalent output
  // eg mult(5,4) can be replaced with 5*4
}