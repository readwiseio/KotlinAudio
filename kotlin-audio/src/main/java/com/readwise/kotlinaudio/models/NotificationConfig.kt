package com.readwise.kotlinaudio.models

import android.app.PendingIntent
import androidx.annotation.DrawableRes

/**
 * Used to configure the player notification.
 * @param buttons Provide customized notification buttons. They will be shown once set. Note that buttons can still be shown and hidden at runtime by using the functions in
 * [NotificationManager][com.readwise.kotlinaudio.notification.NotificationManager], but they will have the default icon if not set explicitly here.
 * @param accentColor The accent color of the notification.
 * @param smallIcon The small icon of the notification which is also shown in the system status bar.
 * @param pendingIntent The [PendingIntent] that would be called when tapping on the notification itself.
 */
data class NotificationConfig(
    val buttons: List<NotificationButton>,
    val accentColor: Int? = null,
    @DrawableRes val smallIcon: Int? = null,
    val pendingIntent: PendingIntent? = null
)

/**
 * Provide customized notification buttons.
 * @see [com.readwise.kotlinaudio.notification.NotificationManager.showPlayPauseButton]
 * @see [com.readwise.kotlinaudio.notification.NotificationManager.showStopButton]
 * @see [com.readwise.kotlinaudio.notification.NotificationManager.showRewindButton]
 * @see [com.readwise.kotlinaudio.notification.NotificationManager.showRewindButtonCompact]
 * @see [com.readwise.kotlinaudio.notification.NotificationManager.showForwardButton]
 * @see [com.readwise.kotlinaudio.notification.NotificationManager.showForwardButtonCompact]
 * @see [com.readwise.kotlinaudio.notification.NotificationManager.showNextButton]
 * @see [com.readwise.kotlinaudio.notification.NotificationManager.showNextButtonCompact]
 * @see [com.readwise.kotlinaudio.notification.NotificationManager.showPreviousButton]
 * @see [com.readwise.kotlinaudio.notification.NotificationManager.showPreviousButtonCompact]
 */
@Suppress("ClassName")
sealed class NotificationButton {
    class PLAY_PAUSE(@DrawableRes val playIcon: Int? = null, @DrawableRes val pauseIcon: Int? = null): NotificationButton()
    class STOP(@DrawableRes val icon: Int? = null): NotificationButton()
    class FORWARD(@DrawableRes val icon: Int? = null, val isCompact: Boolean = false): NotificationButton()
    class BACKWARD(@DrawableRes val icon: Int? = null, val isCompact: Boolean = false): NotificationButton()
    class NEXT(@DrawableRes val icon: Int? = null, val isCompact: Boolean = false): NotificationButton()
    class PREVIOUS(@DrawableRes val icon: Int? = null, val isCompact: Boolean = false): NotificationButton()
}
