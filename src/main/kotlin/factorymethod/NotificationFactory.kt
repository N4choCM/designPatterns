package org.example.factory

object NotificationFactory {

    fun create(type: NotificationType): Notification =
        when (type) {
            NotificationType.SMS -> SmsNotification()
            NotificationType.EMAIL -> EmailNotification()
            NotificationType.PUSH -> PushNotification()
        }
}
