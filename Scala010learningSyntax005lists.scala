object Main {
  def main(args: Array[String]): Unit = {
    // java's lists are mutable, but scala's are immutable

    // immutable list
    val list1: List[String] = List("Plain Donut","Strawberry Donut","Chocolate Donut")
    println(s"list1 = ${list1}")
    println(list1(0))

    // making a new list out of an immutable list
    val list2: List[String] = list1 :+ "Vanilla Donut"
    // the colon comes on the side where the immutable list is
    println(s"list2 = ${list2}")


    // making another list out of an immutable list
    val list3: List[String] = "Vanilla Donut" +: list2
    // the colon comes on the side where the immutable list is
    println(s"list3 = ${list3}")


    // append two lists
    val list4: List[Any] = list1 ::: list2
    println(s"Add two lists together using ::: = $list4")


    // empty lists
    val emptyList: List[String] = List.empty[String]
    println(s"Empty list = $emptyList")

    //  cons: adding an element to the beginning of a list
    val twoThree = List(2, 3)
    val oneTwoThree = 1 :: twoThree
    println("oneTwoThree: " + oneTwoThree)
//    print("TwoThreeOne: " + twoThree :: 1) // No you can't do this

    // tuples
    val pair = ("Banana", 12, "Apple")
    println("pair(0) = pair._1 = " + pair._1)
    println("pair(1) = pair._2 = " + pair._2)
    println("pair(2) = pair._3 = " + pair._3)



  }
}