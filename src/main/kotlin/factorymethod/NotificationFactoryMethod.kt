package factorymethod

import factorymethod.service.FactoryMethodNotificationService

abstract class NotificationFactoryMethod {

    abstract fun createService(): FactoryMethodNotificationService

    fun sendNotification() {
        val service = createService()
        service.send()
    }
}
