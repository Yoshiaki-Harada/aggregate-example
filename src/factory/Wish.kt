package factory

data class Wish(private val userId: UserId, private val content: Content)

data class Content(val value: String)