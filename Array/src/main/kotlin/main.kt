fun main(args: Array<String>) {

    var diffDataTypes = arrayOf(1, "Eugene", 19.99, "T")

    println(diffDataTypes[1])

    diffDataTypes[1] = "Yolande"

    println("\n" + diffDataTypes[1])

   println("\n" + diffDataTypes.get(2))

    diffDataTypes.set(3, 25.95)

    println("\n" + diffDataTypes.get(3))

    var arraySize = arrayOf(1, 2, 3, 4, 5)

    println("\nSize of Array is : ${arraySize.size}")

    println("\n Find Yolande :  ${diffDataTypes.contains("Yolande")}")

    println("\n First Element : ${diffDataTypes.first()}")

    println("\n Last Element : ${diffDataTypes.last()}")

    println("\n Index of Yolande : ${diffDataTypes.indexOf("Yolande")}")


}