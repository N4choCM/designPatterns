package abstractfactory

import abstractfactory.service.MDRendererServiceImpl
import abstractfactory.service.PushSenderServiceImpl

class PushAbstractFactory : NotificationAbstractFactory {
    override fun createSender() = PushSenderServiceImpl()
    override fun createRenderer() = MDRendererServiceImpl()
}