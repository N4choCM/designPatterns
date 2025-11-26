package abstractfactory.service

class PlainTextRendererServiceImpl : NotificationRendererService {
    override fun render(rawMessage: String) = rawMessage
}