package org.example

import org.example.factory.VehicleFactory
import org.example.factory.VehicleType

fun main() {
    // FACTORY
    val car = VehicleFactory.create(VehicleType.CAR)
    val bike = VehicleFactory.create(VehicleType.BIKE)
    val truck = VehicleFactory.create(VehicleType.TRUCK)
    car.drive()
    bike.drive()
    truck.drive()
}