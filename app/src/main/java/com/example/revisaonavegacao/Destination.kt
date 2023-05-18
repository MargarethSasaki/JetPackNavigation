package com.example.revisaonavegacao

sealed class Destination(var route: String){

    object ScreenSecond: Destination("ScreenSecond")

}

