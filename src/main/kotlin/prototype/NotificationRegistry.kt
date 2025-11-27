package prototype

object NotificationRegistry {
    private val cache = mutableMapOf<String, NotificationPrototype>()

    init {
        println("Initializing Notification Prototypes...")

        val blackFridayEmail = NotificationPrototype(
            subject = "🔥 Black Friday special prices",
            content = "50% discount on everything."
        )

        val welcomeEmail = NotificationPrototype(
            subject = "Welcome!",
            content = "Thanks for using our website."
        )

        cache["BF_EMAIL"] = blackFridayEmail
        cache["WELCOME_EMAIL"] = welcomeEmail
    }

    fun getPrototype(key: String): NotificationPrototype {
        return cache[key] ?: throw IllegalArgumentException("Prototipo not found!")
    }
}