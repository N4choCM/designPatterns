package abstractfactory.service

class MDRendererServiceImpl : NotificationRendererService {
    override fun render(rawMessage: String) = "## $rawMessage"
}