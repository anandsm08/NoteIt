package com.example.noteit.feature.domain.util

sealed class OrderType{
    object ascending: OrderType()
    object descending: OrderType()
}
