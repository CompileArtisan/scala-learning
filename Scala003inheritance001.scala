// A class named “Shape” has data members no_of_sides and methods calculate_area() and find_perimeter(). 
// Two classes namely “Circle” and “Rectangle” are inherited from Shape class. 
// Class Circle has a data member radius and Class Rectangle has data members -width and height.
//  Illustrate the following concepts of creating objects and method overloading and constructor overloading.

object Main {
  def main(args: Array[String]): Unit = {
    val circle = new Circle(5)
    circle.calculate_area()
    circle.find_perimeter()

    val rectangle = new Rectangle(5, 10)
    rectangle.calculate_area()
    rectangle.find_perimeter()
  }
}

class Shape(var no_of_sides: Int) {
  def calculate_area(): Unit = {
    println("Calculating area")
  }

  def find_perimeter(): Unit = {
    println("Finding perimeter")
  }
}

class Circle(var radius: Double) extends Shape(0) {
  override def calculate_area(): Unit = {
    println(s"Area of circle: ${3.14 * radius * radius}")
  }

  override def find_perimeter(): Unit = {
    println(s"Perimeter of circle: ${2 * 3.14 * radius}")
  }
}

class Rectangle(var width: Double, var height: Double) extends Shape(4) {
  override def calculate_area(): Unit = {
    println(s"Area of rectangle: ${width * height}")
  }

  override def find_perimeter(): Unit = {
    println(s"Perimeter of rectangle: ${2 * (width + height)}")
  }
}

