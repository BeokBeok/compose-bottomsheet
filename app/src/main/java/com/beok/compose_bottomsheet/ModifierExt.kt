package com.beok.compose_bottomsheet

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed

@SuppressLint("UnnecessaryComposedModifier")
fun Modifier.noRippleClickable(
    enabled: Boolean = true,
    onClick: () -> Unit
): Modifier = composed {
    clickable(
    enabled = enabled,
    indication = null,
    interactionSource = remember {
        MutableInteractionSource()
    },
    onClick = onClick
) }
