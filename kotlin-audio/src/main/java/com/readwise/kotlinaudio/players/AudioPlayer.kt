package com.readwise.kotlinaudio.players

import android.content.Context
import com.readwise.kotlinaudio.models.BufferConfig
import com.readwise.kotlinaudio.models.CacheConfig
import com.readwise.kotlinaudio.models.PlayerConfig

class AudioPlayer(context: Context, playerConfig: PlayerConfig = PlayerConfig(), bufferConfig: BufferConfig? = null, cacheConfig: CacheConfig? = null): BaseAudioPlayer(context, playerConfig, bufferConfig, cacheConfig)