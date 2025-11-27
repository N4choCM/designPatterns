package builder.model

data class Notification(
    val id: Int,
    val userId: Int,
    val subject: String,
    val content: String
) {
    class Builder {
        var id: Int = 0
        var userId: Int = 0
        var subject: String = ""
        var content: String = ""

        fun build() = Notification(id, userId, subject, content)
    }
}