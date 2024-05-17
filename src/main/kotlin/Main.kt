fun main(args: Array<String>) {
    val banker = Banker("Kevin Hart", 24)
    val doctor = Doctor("Anne", 30)
    val farmer = Farmer("Scarlet", 24)


    banker.introducton()
    banker.eat()
    banker.countmoney(arrayOf(100, 50, 200, 500, 100))
    banker.sleep()
    banker.talk("Right turn")


    doctor.introducton()
    doctor.eat()
    doctor.sleep()
    doctor.talk("you are ")


    farmer.introducton()
    farmer.eat()
    farmer.sleep()
    farmer.cultivateLand()



}

open class Person( var name: String, var age: Int) {
    fun talk(words: String) {
        println(words)
    }

    open fun eat() {
        println("yam")
    }

    fun sleep() {
        println("zzzzzzzzz")
    }
     open fun introducton(){
        println("Hi I am is $name")
    }
}

class Banker(name: String, age: Int) : Person(name, age) {


    fun countmoney(notes: Array<Int>): Int {
        var sum = 0
        notes.forEach { note -> sum += note }
        return sum

    }

    override fun introducton() {
        println("Hi I am $name  C.P.A")
    }
}


class Doctor(name: String, age: Int) : Person(name, age) {

    fun treatPatient(patient: String, disease: String) {
        println("Treat $patient for $disease")
    }

    override fun introducton() {
//        super.introducton()
        println("I am Doctor $name")
    }

}

class Farmer(name: String, age: Int) : Person(name, age) {

    fun cultivateLand() {
        println(" dig dig dig")
    }

    override fun eat() {
//        super.eat()
        println("I am eating the food that I have grown")
    }
}