package org.example.factory

class EmailNotification : Notification {
    override fun send() = println("Sending email...")
}
