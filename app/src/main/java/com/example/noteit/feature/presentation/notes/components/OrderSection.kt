package com.example.noteit.feature.presentation.notes.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.noteit.feature.domain.util.OrderNoteType
import com.example.noteit.feature.domain.util.OrderType

@Composable
fun OrderSection(
    modifier: Modifier = Modifier ,
    noteOrder: OrderNoteType = OrderNoteType.Date(OrderType.descending),
    onOrderChange: (OrderNoteType) -> Unit
    ){
        Column(modifier= Modifier.fillMaxWidth()) {
            DefaultRadioButton(text = "Title", selected =noteOrder is OrderNoteType.Title , onCheck = { onOrderChange(OrderNoteType.Title(noteOrder.orderType)) })
            Spacer(modifier = Modifier.width(8.dp))
            DefaultRadioButton(text = "Date", selected =noteOrder is OrderNoteType.Date , onCheck = { onOrderChange(OrderNoteType.Date(noteOrder.orderType)) })
            Spacer(modifier = Modifier.width(8.dp))
            DefaultRadioButton(text = "Color", selected =noteOrder is OrderNoteType.Color , onCheck = { onOrderChange(OrderNoteType.Color(noteOrder.orderType)) })

        }
    Spacer(modifier= Modifier.height(16.dp))
    Row(modifier = Modifier.fillMaxWidth()){
        DefaultRadioButton(text = "Ascending", selected =noteOrder.orderType is  OrderType.ascending, onCheck = { onOrderChange(noteOrder.copy(OrderType.ascending)) })
        DefaultRadioButton(text = "Descending", selected =noteOrder.orderType is  OrderType.descending, onCheck = { onOrderChange(noteOrder.copy(OrderType.descending)) })

    }
}