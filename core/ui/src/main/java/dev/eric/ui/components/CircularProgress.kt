package dev.eric.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import dev.eric.ui.theme.primary100

@Composable
fun CircularProgress(
    modifier: Modifier = Modifier,
    color: Color = primary100,
) {
    CircularProgressIndicator(
        modifier = modifier,
        strokeWidth = 2.dp,
        color = color,
    )
}

@Composable
fun CenteredLoading(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center,
    ) {
        CircularProgress(modifier = Modifier.size(28.dp))
    }
}