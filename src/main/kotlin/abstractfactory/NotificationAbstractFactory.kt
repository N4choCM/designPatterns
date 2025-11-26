package abstractfactory

import abstractfactory.service.NotificationRendererService
import abstractfactory.service.NotificationSenderService

interface NotificationAbstractFactory {
    fun createSender(): NotificationSenderService
    fun createRenderer(): NotificationRendererService}