package factorymethod

import factorymethod.service.EmailNotificationService

class EmailNotificationFactoryMethod : NotificationFactoryMethod() {
    override fun createService() = EmailNotificationService()
}