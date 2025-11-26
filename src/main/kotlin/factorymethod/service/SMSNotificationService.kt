package factorymethod.service

class SMSNotificationService : FactoryMethodNotificationService {
    override fun send() = println("Sending SMS...")
}