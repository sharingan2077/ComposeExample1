package ru.yandex.school.video3

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Track() {
    Column {
        Text("Aishite Aishite Aishite")
        Text("Ado")
    }

}

@Preview
@Composable
private fun TrackPreview() {
    Track()
}