fun main(){

    var subaru=Car("subaru","legacy","white",30)
    subaru.carry(50)
    println( subaru.calculateParkingFees(2))
    println(subaru.capacity)
    subaru.identity()
    var bus=Bus("toyota","minibus","blue",50)
    bus.carry(40)
    println(bus.calculateParkingFees(4))
    bus.identity()
    bus.capacity
    println(bus.maxTripFare(100.0))
    println(bus.calculateParkingFees(3))


}
open class Vehicles(var make: String,var model: String,var color: String,var capacity: Int){
    fun carry(people:Int) {
        var x = people - capacity
        if (people <= capacity) {
            println("carrying $people Capacity")
        }
        else {
            println("Overcapacity $x people")
        }
    }
    fun identity(){
        println("I am $color $make $model")
    }
    open fun calculateParkingFees(hours:Int):Int{
        var parkingFees=hours*20
        return (parkingFees)

    }

}
class Car( make:String, model:String, color:String, capacity:Int):Vehicles(make,model, color, capacity){

}

class Bus( make:String, model:String, color:String, capacity:Int):Vehicles(make,model, color, capacity) {

    fun maxTripFare(fare: Double): Double {
        var maxFare = fare.times(capacity)
        return maxFare

    }

    override fun calculateParkingFees(hours: Int): Int {
        var parkingfees = hours*capacity
        return parkingfees


    }
}