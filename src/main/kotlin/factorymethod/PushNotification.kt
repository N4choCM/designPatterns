package org.example.factory

class PushNotification : Notification {
    override fun send() = println("Sending Push Notification...")
}
