fun main() {
    val myFirstDice = Dice(6,"white")
    println("Your ${myFirstDice.numSides} sided and ${myFirstDice.color} dice rolled ${myFirstDice.roll()}!")

    val mySecondDice = Dice(20,"red")
    println("Your ${mySecondDice.numSides} sided and ${mySecondDice.color} dice rolled ${mySecondDice.roll()}!")
}

class Dice (val numSides: Int, val color:String) {


    fun roll(): Int {
        return (1..numSides).random()
    }
}