package org.example.factory

class SmsNotification : Notification {
    override fun send() = println("Sending SMS...")
}
