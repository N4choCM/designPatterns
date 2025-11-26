package abstractfactory.service

class PushSenderServiceImpl : NotificationSenderService {
    override fun send(userId: Int, content: String) = println("Push notification to $userId: $content")
}