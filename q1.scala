// Inventory management system

object Q1 extends App {
    val itemNames = Array("Pen", "Book", "Paper")
    val itemQuantity = Array(10, 5, 7)
    val len = itemNames.length

    val stringMaker = (i: Int) => s"${itemNames(i)}\t-\t${itemQuantity(i)}"
    val displayInventory = () => {
        println("Inventory:")
        for(i <- 0 to len-1) println(stringMaker(i))
        println("")
    }

    val findIndex = (name: String) => itemNames.indexOf(name)
    val restockItem = (name: String, quantity: Int) => findIndex(name) match {
        case -1 => println("Item not found!")
        case x => itemQuantity(x) = itemQuantity(x) + quantity
    }

    val sellItem = (name: String, quantity: Int) => findIndex(name) match {
        case -1 => println("Item not found!")
        case x => itemQuantity(x) = itemQuantity(x) - quantity
    }

    // testing code:

    restockItem("Bag", 3)
    displayInventory()
    restockItem("Paper", 3)
    displayInventory()

    sellItem("Bag", 2)
    displayInventory()
    sellItem("Pen", 2)
    displayInventory()
}
