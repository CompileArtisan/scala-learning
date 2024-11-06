object Main {
  def main(args: Array[String]): Unit = {
    var x = new Person("Praanesh", 19, 59.5)
    println(x.getName())
    x.setName("Varun")
    println(x.getName())

    var y = new Person()
    println(y.getName())
  }
}

class Person(name: String = "Not-Initialized", age: Int = 0, weight: Float = 0) {

  var Name = name
  var Age = age
  var Weight = weight
  def getName(): String = {
    return Name
  }

  def setName(name: String): Unit = {
    Name = name
  }


}