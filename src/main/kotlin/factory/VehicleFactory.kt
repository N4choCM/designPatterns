package org.example.factory

object VehicleFactory {

    fun create(type: VehicleType): Vehicle =
        when (type) {
            VehicleType.CAR -> Car()
            VehicleType.BIKE -> Bike()
            VehicleType.TRUCK -> Truck()
        }
}
