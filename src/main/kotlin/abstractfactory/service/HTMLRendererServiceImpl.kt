package abstractfactory.service

class HTMLRendererServiceImpl : NotificationRendererService {
    override fun render(rawMessage: String) = "<html><body>$rawMessage</body></html>"
}