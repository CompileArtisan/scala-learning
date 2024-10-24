// Define a class named Mobile phone  with data members company name, model name, price and storage. Define  the following methods
// a.	get_details
// b.	display_details : (to be called after the discount has been applied)
// c.	discount : the method discount will provide a 5% discount if the price is above 10000. 
//           Illustrate the concept of creating an array of objects.
object Main {
  def main(args: Array[String]): Unit = {
    val phones = Array(
      new MobilePhone("Apple", "iPhone 13", 12000, 128),
      new MobilePhone("Samsung", "Galaxy S21", 8000, 256)
    )

    for (phone <- phones) {
      phone.discount()
      phone.display_details()
    }
  }
}

class MobilePhone(var companyName: String, var modelName: String, var price: Double, var storage: Int) {

  def get_details(company: String, model: String, price: Double, storage: Int): Unit = {
    this.companyName = company
    this.modelName = model
    this.price = price
    this.storage = storage
  }

  def display_details(): Unit = {
    println(s"Company: $companyName")
    println(s"Model: $modelName")
    println(s"Price after discount: $price")
    println(s"Storage: $storage GB")
  }

  def discount(): Unit = {
    if (price > 10000) {
      price = price * 0.95
    }
  }
}
