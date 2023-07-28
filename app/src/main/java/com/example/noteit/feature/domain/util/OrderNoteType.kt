package com.example.noteit.feature.domain.util

sealed class OrderNoteType(val orderType: OrderType){
    class Title(orderType: OrderType):OrderNoteType(orderType)
    class Date(orderType: OrderType):OrderNoteType(orderType)
    class Color(orderType: OrderType):OrderNoteType(orderType)


    fun copy(orderType: OrderType): OrderNoteType{
        return when(this){
            is Title -> Title(orderType)
            is Date -> Date(orderType)
            is Color -> Color(orderType)

        }
    }
}
