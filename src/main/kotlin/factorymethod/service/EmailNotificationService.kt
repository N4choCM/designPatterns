package factorymethod.service

class EmailNotificationService : FactoryMethodNotificationService {
    override fun send() = println("Sending email...")
}