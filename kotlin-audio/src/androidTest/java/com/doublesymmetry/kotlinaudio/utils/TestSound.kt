package com.readwise.kotlinaudio.utils

import com.readwise.kotlinaudio.test.R
import com.readwise.kotlinaudio.models.AudioItemOptions
import com.readwise.kotlinaudio.models.DefaultAudioItem
import com.readwise.kotlinaudio.models.MediaType

object TestSound {
    /** The common test case (track is 3 seconds long). */
    val default = DefaultAudioItem(
        "rawresource:///${R.raw.short_test_sound}", MediaType.DEFAULT,
        options = AudioItemOptions(
            resourceId = R.raw.test_sound,
        )
    )

    /** A short test case (track is less than 1 second long). */
    val short = DefaultAudioItem(
        "rawresource:///${R.raw.short_test_sound}", MediaType.DEFAULT,
        options = AudioItemOptions(
            resourceId = R.raw.short_test_sound,
        )
    )

    /** A longer test case (track is around 6 minutes long). */
    val long = DefaultAudioItem(
        "rawresource:///${R.raw.kalimba}", MediaType.DEFAULT,
        title = "Dirty Computer",
        artwork = "https://upload.wikimedia.org/wikipedia/en/0/0b/DirtyComputer.png",
        artist = "Janelle Monáe",
        options = AudioItemOptions(
            resourceId = R.raw.kalimba,
        )
    )

    /** A longer test case (track is around 6 minutes long). */
    val long2 = DefaultAudioItem(
        "rawresource:///${R.raw.longing}", MediaType.DEFAULT,
        title = "Longing",
        artwork = "https://react-native-track-player.js.org/example/Longing.jpeg",
        artist = "David Chavez",
        options = AudioItemOptions(
            resourceId = R.raw.longing,
        )
    )

    /** A remote test case (track is around 6 minutes long). */
    val remote = DefaultAudioItem(
        "https://file-examples-com.github.io/uploads/2017/11/file_example_MP3_1MG.mp3", MediaType.DEFAULT,
        title = "Melodrama",
        artwork = "https://images-na.ssl-images-amazon.com/images/I/A18QUHExFgL._SL1500_.jpg",
        artist = "Lorde"
    )
}
