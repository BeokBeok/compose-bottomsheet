package com.beok.compose_bottomsheet

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomSheetScaffoldState
import androidx.compose.material.Button
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
@ExperimentalMaterialApi
fun DebugScreen(
    scaffoldState: BottomSheetScaffoldState,
    onToggle: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "fraction = ${scaffoldState.bottomSheetState.progress.fraction}")
        Text(text = "target = ${scaffoldState.bottomSheetState.targetValue}")
        Text(text = "current = ${scaffoldState.bottomSheetState.currentValue}")
        Text(text = "New fraction = ${scaffoldState.currentFraction}")

        Button(
            modifier =  Modifier.padding(20.dp),
            onClick = onToggle
        ) {
            Text(text = "Click to show/hide bottom sheet")
        }
    }
}
