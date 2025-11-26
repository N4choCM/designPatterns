package abstractfactory.service

interface NotificationSenderService {
    fun send(userId: Int, content: String)
}