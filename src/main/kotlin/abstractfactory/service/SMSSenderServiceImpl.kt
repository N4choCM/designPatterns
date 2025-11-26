package abstractfactory.service

class SMSSenderServiceImpl : NotificationSenderService {
    override fun send(userId: Int, content: String) = println("SMS to $userId: $content")
}