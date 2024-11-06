import scala.io.StdIn.readLine
// Creating object 
object Sup { 
 
// Main method 
def main(args: Array[String]): Unit = 
{ 
    var input = readLine("Enter your name: ")
    println(s"Hello $input") 

    println("\n\nAll number including 10")
    for(i <- 1 to 10){
        println(s"i = $i")
    }

    println("\n\nAll alphabets excluding z")
    for(i <- 'a' until 'z') print(i)

    println("\n\nOnly Even Numbers")
    for(i <- 0 to 10 if i%2==0) println(i)

    println("\n\nImmutable Variables (val)")
    val x = 10
    // x = 20 // This will give error

    println("\n\nMutable Variables (var)")
    var y = 10
    y = 20
    println(y)

    
} 
}