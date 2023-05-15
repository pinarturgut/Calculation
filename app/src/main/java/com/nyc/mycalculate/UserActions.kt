package com.nyc.mycalculate

sealed class UserActions {
    data class Number( val number : Int): UserActions()
    data class Operation(val operation:AllOperation) :UserActions()
    object Clean: UserActions()
    object Delete: UserActions()
    object Decimal: UserActions()
    object Calculate: UserActions()
}
