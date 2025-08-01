package com.example.mylifecycle.abstraction

abstract class Car {
   abstract fun start():String
    abstract fun engine(): String
    abstract fun stop(): String
    fun driverName(){
        print("amar")
    }

}