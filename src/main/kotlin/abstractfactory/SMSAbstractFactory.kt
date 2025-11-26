package abstractfactory

import abstractfactory.service.PlainTextRendererServiceImpl
import abstractfactory.service.SMSSenderServiceImpl

class SMSAbstractFactory : NotificationAbstractFactory {
    override fun createSender() = SMSSenderServiceImpl()
    override fun createRenderer() = PlainTextRendererServiceImpl()
}