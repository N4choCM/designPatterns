package abstractfactory.service

import abstractfactory.NotificationAbstractFactory

class AbstractFactoryNotificationService (private val factory: NotificationAbstractFactory) {
    fun notifyUser(userId: Int, message: String) {
        val renderer = factory.createRenderer()
        val sender = factory.createSender()
        val content = renderer.render(message)
        sender.send(userId, content)
    }
}