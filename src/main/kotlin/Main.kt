import factorymethod.EmailNotificationFactoryMethod
import abstractfactory.EmailAbstractFactory
import abstractfactory.NotificationAbstractFactory
import abstractfactory.PushAbstractFactory
import abstractfactory.service.AbstractFactoryNotificationService
import abstractfactory.SMSAbstractFactory
import factorymethod.NotificationFactoryMethod
import factorymethod.PushNotificationFactoryMethod
import factorymethod.SMSNotificationFactoryMethod

fun main() {
    // FACTORY METHOD
    println("===========================================")
    println("FACTORY METHOD")
    println("===========================================")
    val emailFm: NotificationFactoryMethod = EmailNotificationFactoryMethod()
    emailFm.sendNotification()
    val smsFm: NotificationFactoryMethod = SMSNotificationFactoryMethod()
    smsFm.sendNotification()
    val pushFm: NotificationFactoryMethod = PushNotificationFactoryMethod()
    pushFm.sendNotification()
    println()

    // ABSTRACT FACTORY
    println("===========================================")
    println("ABSTRACT FACTORY")
    println("===========================================")
    val msg = "Welcome to the Design Patterns Repo!"
    val emailAf: NotificationAbstractFactory = EmailAbstractFactory()
    val emailAfS = AbstractFactoryNotificationService(emailAf)
    emailAfS.notifyUser(userId = 101, message = msg)
    val smsAf: NotificationAbstractFactory = SMSAbstractFactory()
    val smsAfS = AbstractFactoryNotificationService(smsAf)
    smsAfS.notifyUser(userId = 102, message = msg)
    val pushAf: NotificationAbstractFactory = PushAbstractFactory()
    val pushAfS = AbstractFactoryNotificationService(pushAf)
    pushAfS.notifyUser(userId = 102, message = msg)
}