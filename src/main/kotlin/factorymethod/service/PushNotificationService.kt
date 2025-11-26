package factorymethod.service

class PushNotificationService : FactoryMethodNotificationService {
    override fun send() = println("Sending Push Notification...")
}