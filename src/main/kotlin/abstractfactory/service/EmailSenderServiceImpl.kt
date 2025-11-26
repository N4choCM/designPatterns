package abstractfactory.service

class EmailSenderServiceImpl : NotificationSenderService {
    override fun send(userId: Int, content: String) = println("Email to $userId: $content")
}