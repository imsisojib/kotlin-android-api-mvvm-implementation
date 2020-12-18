package imsisojib

/**Online Compiler Link: https://pl.kotl.in/ZapgNFb3g*/

fun main(args: Array<String>){
    var firstElement: Int = 1
    var secondElement: Int = 1
    var sumOfTwo:Int = 0
    var sumOfSeries:Int = 1
    var count:Int = 2
    var totalBlanketOfKonka:Int = 53
    var totalBlanketOfTitli:Int = 36


    print("Fibonacci Series for Blanket: "+firstElement+" "+secondElement) //printing 0 and 1

    while (sumOfSeries <= totalBlanketOfKonka+totalBlanketOfTitli){
        sumOfTwo = firstElement + secondElement

        //fibonacci last element
        sumOfSeries += secondElement
        firstElement = secondElement
        secondElement = sumOfTwo

        if (sumOfSeries+secondElement> totalBlanketOfKonka+totalBlanketOfTitli) break
        print(" " + sumOfTwo)
        count++
    }
    println()
    println("Sum of Series = "+sumOfSeries)
    println("Total Blanket = "+(totalBlanketOfKonka+totalBlanketOfTitli))
    println("Minimum Organization = "+count)

}