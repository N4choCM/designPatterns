package abstractfactory

import abstractfactory.service.EmailSenderServiceImpl
import abstractfactory.service.HTMLRendererServiceImpl

class EmailAbstractFactory : NotificationAbstractFactory {
    override fun createSender() = EmailSenderServiceImpl()
    override fun createRenderer() = HTMLRendererServiceImpl()
}