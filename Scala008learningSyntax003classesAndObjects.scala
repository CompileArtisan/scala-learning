object Main {
  def main(args: Array[String]): Unit = {
    var x = new Person("Praanesh", 19, 59.5)
    println(x.getName())
    x.setName("Varun")
    println(x.getName())
  }
}

class Person(name: String, age: Int, weight: Float) {

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