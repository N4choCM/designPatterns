package factorymethod

import factorymethod.service.PushNotificationService

class PushNotificationFactoryMethod : NotificationFactoryMethod() {
    override fun createService() = PushNotificationService()
}