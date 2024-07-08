object InventoryManagement {

  var itemNames: Array[String] = Array("Apple", "Banana", "Orange")
  var itemQuantities: Array[Int] = Array(10, 15, 20)

  def displayInventory(): Unit = {
    println("Current Inventory -")
    for (i <- itemNames.indices) {
      println(s"${itemNames(i)} - Quantity: ${itemQuantities(i)}")
    }
  }

  def restockItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index != -1) {
      itemQuantities(index) += quantity
      println(s"Succesfully Restocked")
    } else {
      println(s"Item $itemName not found")
    }
  }

  def sellItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index != -1) {
      if (itemQuantities(index) >= quantity) {
        itemQuantities(index) -= quantity
        println(s"Sold $quantity units")
      } else {
        println(s"Not enough $itemName to sell")
      }
    } else {
      println(s"Item $itemName not found")
    }
  }

  def enterNum(): Unit= {
    print("Enter a number - ")  
        val input = scala.io.StdIn.readInt()
        val result = input match {
          case x if x <= 0 => "Negative/Zero is input"
          case x if x % 2 == 0 => "Even number is given"
          case x if x % 2 != 0 => "Odd number is given"
        }
         println(result)
  }

  def toUpper(name:String):String = {
           name.toUpperCase()
     }
     def toLower(name:String):String = {
           name.toLowerCase()
     }
     def formatNames(name:String)(formatFunction:String => String):String = {
           formatFunction(name)
     }

  def main(args: Array[String]): Unit = {
    displayInventory()

    restockItem("Banana", 5)
    displayInventory()
    restockItem("Grapes", 10)

    sellItem("Apple", 3)
    displayInventory()
    sellItem("Orange", 25) 

    displayInventory()

    enterNum()

    val names = List("Benny","Niroshan","Saman","Kumara")
          println(toUpper(names(0))) 
          println(formatNames(names(1))(name => name.substring(0, 2).toUpperCase + name.substring(2).toLowerCase)) 
          println(toLower(names(2))) 
          println(formatNames(names(3))(name => name.substring(0, 1).toUpperCase + name.substring(1, name.length - 1).toLowerCase + name.substring(name.length - 1).toUpperCase))  
  }
}
