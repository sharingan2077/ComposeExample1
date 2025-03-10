package ru.yandex.school.video3

fun createTrackList(count: Int): List<TrackUiModel> {
    val titles = listOf("Ocean Waves", "Mountain Echo", "City Lights", "Silent Whisper", "Golden Horizon")
    val authors = listOf("Liam Smith", "Emma Johnson", "Noah Brown", "Olivia Williams", "Sophia Martinez")
    val descriptions = listOf("Album Cover 1", "Album Cover 2", "Album Cover 3", "Album Cover 4", "Album Cover 5")

    val list = mutableListOf<TrackUiModel>()
    for (i in 0 until count) {
        list.add(
            TrackUiModel(
                title = titles.random(),
                author = authors.random(),
                description = descriptions.random()
            )
        )
    }
    return list
}