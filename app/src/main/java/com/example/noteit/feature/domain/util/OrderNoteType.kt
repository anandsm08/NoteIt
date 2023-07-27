package com.example.noteit.feature.domain.util

sealed class OrderNoteType(val orderType: OrderType){
    class Title(orderType: OrderType):OrderNoteType(orderType)
    class Date(orderType: OrderType):OrderNoteType(orderType)
    class Color(orderType: OrderType):OrderNoteType(orderType)
}
