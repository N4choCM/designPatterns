import factorymethod.EmailNotificationFactoryMethod
import abstractfactory.EmailAbstractFactory
import abstractfactory.NotificationAbstractFactory
import abstractfactory.PushAbstractFactory
import abstractfactory.service.AbstractFactoryNotificationService
import abstractfactory.SMSAbstractFactory
import builder.model.Notification
import factorymethod.NotificationFactoryMethod
import factorymethod.PushNotificationFactoryMethod
import factorymethod.SMSNotificationFactoryMethod
import prototype.NotificationRegistry

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
    println()

    // BUILDER
    println("===========================================")
    println("BUILDER")
    println("===========================================")
    val notification = Notification.Builder().apply {
        id = 1
        userId = 1
        subject = "This is the Builder Design Pattern Subject!"
        content = "This is the Builder Design Pattern Content!"
    }.build()
    println(notification.toString())
    println()

    println("===========================================")
    println("PROTOTYPE")
    println("===========================================")
    val userIds = intArrayOf(1, 2, 3, 4)
    val newUserIds = intArrayOf(3, 4)
    val welcomeEmailTemplate = NotificationRegistry.getPrototype("WELCOME_EMAIL")
    for(i in newUserIds.indices) {
        welcomeEmailTemplate.copy(userId = newUserIds[i]).show()
    }
    val blackFridayEmailTemplate = NotificationRegistry.getPrototype("BF_EMAIL")
    for(i in userIds.indices) {
        blackFridayEmailTemplate.copy(userId = userIds[i]).show()
    }
}