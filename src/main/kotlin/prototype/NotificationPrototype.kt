package prototype

data class NotificationPrototype(
    val subject: String,
    val content: String,
    val userId: Int = 0
) {
    fun show() {
        println("Notification for user '$userId': [$subject] - $content")
    }
}
