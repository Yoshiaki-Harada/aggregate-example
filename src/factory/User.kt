package factory


class User(val userId: UserId) {
    fun makeWish(content: Content): Wish = Wish(this.userId, content)
}

data class UserId(val value: String)