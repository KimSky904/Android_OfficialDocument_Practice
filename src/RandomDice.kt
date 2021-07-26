class RandomDice {
    val sides = 6
    fun roll(){
        val randNumber = (1..6).random()
        println(randNumber)
    }
}
fun main() {
    val myFirstDice = RandomDice()
    println(myFirstDice.sides)
    myFirstDice.roll()
}