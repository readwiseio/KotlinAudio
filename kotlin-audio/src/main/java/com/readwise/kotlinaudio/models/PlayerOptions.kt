package com.readwise.kotlinaudio.models

interface PlayerOptions {
    var alwaysPauseOnInterruption: Boolean
}

internal data class DefaultPlayerOptions(
    override var alwaysPauseOnInterruption: Boolean = false,
) : PlayerOptions
