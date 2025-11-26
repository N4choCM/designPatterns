package factorymethod

import factorymethod.service.SMSNotificationService

class SMSNotificationFactoryMethod : NotificationFactoryMethod() {
    override fun createService() = SMSNotificationService()
}