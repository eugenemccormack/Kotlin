fun main(args : Array<String>){

    for(n in 1..10){

        println("Loop: $n")
    }

    println("\n")

    val testArray = arrayOf("a", "b", "c", "d")

    for (str in testArray){

        println(str)
    }

    println("\n")

    val nameArray = arrayOf("Eugene", "Evan", "Yolande", "Melissa")

    for (n in nameArray.indices){

        println("nameArray[$n]: ${nameArray[n]}")
    }

    println("Range : " + nameArray.indices)
    println("\n")

    val indexArray = arrayOf("Eugene", "Evan", "Yolande", "Melissa")

    for((index, value) in indexArray.withIndex()){

        println("Value at Index $index is: $value")
    }

    }