import scala.io.StdIn.readLine
object Main{
  def main(args: Array[String]): Unit = {
    println("type 1 for normal forloop")
    println("type 2 for reversed forloop")
    println("type 3 for working with list")
    println("type 4 for numeric range in scala")
    println("type 5 for alphabetic range in scala")
    println("type 6 for converting scala range to collections")
    println("type 7 for reassigning var")
    println("type 8 for while ")
    println("type 9 for arrays")

    // All class names should be capitalized, and method names shouldn't

    var decision_as_string = readLine()
    val decision = decision_as_string.toInt // toInt parses int from string

    // normal for loop
    if (decision == 1) {
      for(i <- 0 to 10 by 2) print(i+" ")
    }

    // reversed for loop
    else if (decision == 2) {
      for(i <- 10 to 1 by -1) print(s"$i ")
    }

    // working with lists
    else if (decision == 3) {
      val words = List("the", "quick", "brown", 29)
      for(word <- words){
        print(s"${word} - ")
      }
    }

    // numeric range in scala
    else if (decision == 4) {
      val x = 0 until 20 by 2
      print(s"${x}: ")
      for(i <- x){ print(s"${i} ")}
    }

    // alphabetic range in scala
    else if (decision == 5) {
      val x = 'a' to 'z'
      for( i <- x) print(s"${i} ")
    }

    // converting scala range to collections
    else if (decision == 6) {
      val x = 0 to 10
      var y = x.toList            // toSet toSeq toArray
      println(y)
      var z = y.mkString(" ")
      print(z)
    }

    // reassigning var ( you can only do it if the datatype is the same )
    else if (decision == 7) {
      var b = 0
      println(b)
      b = 10
      println(b)
    }

    // while loop
    else if (decision == 8) {
      var i = 0

      while(i<10){
        print(s"${i} ")
        i+=1 // this is increment btw
      }
      print("\n")


    }

    // working with arrays
    else if(decision == 9) {
      var students = new Array[String](4)
      students(0) = "student0"
      students(1) = "student1"
      students(2) = "student2"
      students.update(3, "student3") //another way of working with arrays
      println(students) // prints some object reference
      for( x <- students ) println(x)
      for(i <- 0 to 2) println()

      for(i <- 0.until(students.length)) println(students.apply(i))

      // students(i) when accessing value is the same as students.apply(i)
      // students(i) when updating value is the same as students.update(i, new value)
      // 0 to 3   <=>   0.to(3)
      // 1 + 2   <=>   1.+(2)

      println(1.+(2))

      var students = Array("zero", "one", "two", "three")
      // = var students = Array.apply("zero", "one", "two", "three")
    }


  }
}