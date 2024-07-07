// Inventory management system

object Q1 extends App {
    val itemNames = Array("Pen", "Book", "Paper")
    val itemQuantity = Array(10, 5, 7)
    val len = itemNames.length

    val stringMaker = (i: Int) => s"${itemNames(i)}\t-\t${itemQuantity(i)}"
    val displayInventory = (length: Int) => {
        println("Inventory:")
        for(i <- 0 to len-1) println(stringMaker(i))
    }

    val findIndex = (name: String) => itemNames.indexOf(name)
    val restockItem = (name: String, quantity: Int) => findIndex(name) match {
        case -1 => println("Item not found!")
        case x => itemQuantity(x) = itemQuantity(x) + quantity
    }

    restockItem("Bag", 3)
    displayInventory(len)

    restockItem("Paper", 3)
    displayInventory(len)
    
}
