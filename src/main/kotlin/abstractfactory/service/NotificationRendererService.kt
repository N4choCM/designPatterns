package abstractfactory.service

interface NotificationRendererService {
    fun render(rawMessage: String): String
}