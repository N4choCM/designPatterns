package org.example

import org.example.factory.NotificationFactory
import org.example.factory.NotificationType

fun main() {
    // FACTORY
    val sms = NotificationFactory.create(NotificationType.SMS)
    val email = NotificationFactory.create(NotificationType.EMAIL)
    val push = NotificationFactory.create(NotificationType.PUSH)
    sms.send()
    email.send()
    push.send()
}