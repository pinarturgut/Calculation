package com.nyc.mycalculate


sealed class AllOperation(val symbol: String) {
    object Add : AllOperation("+")
    object Subtract : AllOperation("-")
    object Multiply : AllOperation("x")
    object Divide : AllOperation("/")

}
