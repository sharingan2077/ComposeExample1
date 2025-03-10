package ru.yandex.school.video3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Track(track: TrackUiModel) {
    Row(
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp).fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(R.drawable.ado_album),
            contentDescription = track.description,
            modifier = Modifier
                .size(50.dp)
                .clip(RoundedCornerShape(size = 4.dp))
        )
        Column(modifier = Modifier.padding(start = 8.dp).weight(1f)) {
            Text(text = track.title, fontSize = 16.sp)
            Text(text = track.author,
                fontSize = 14.sp,
                color = Color.Black.copy(alpha = 0.5f))
        }
        IconButton(onClick = {}) {
            Icon(imageVector = Icons.Default.MoreVert, contentDescription = "More")
        }
    }

}

@Composable
fun TrackList(tracks: List<TrackUiModel>) {
    Column {
        tracks.forEach { track ->
            Track(track)
        }
    }
}

data class TrackUiModel(
    val title: String,
    val author: String,
    val description: String,
)

@Preview
@Composable
private fun TrackPreview() {
    Track(TrackUiModel(
        title = "Ashite",
        author = "Ado",
        description = "Ado album"
    ))
}

@Preview
@Composable
private fun TrackListPreview() {
    TrackList(
        tracks = createTrackList(30)
    )

}