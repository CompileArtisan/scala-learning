object Main {
  def main (args: Array[String]): Unit =  {
    var x = new Person("rahul", -99) // instance of class is invoked
    var y = Person("rahul", -99)     // companion object is invoked

    x.about()
    y.about()
  }
}

class Person (name: String, age: Int){
  def about(): Unit = {
    println(s"Hey there! I am ${name}, a ${age} year old.")
  }
}

object Person {
  def apply(name: String, age: Int): Person = {
    if (age<0){
      return new Person("Invalid", 0)
    } else {
      return new Person(name, age)
    }
  }
}