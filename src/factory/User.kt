package factory

class User(val userId: UserId, val wishes: List<Wish>) {
    fun makeWish(content: Content): Wish {
        if (wishes.size >=3) {
            throw MaxNumberOfWishesExceededException()
        }
        return Wish(this.userId, content)
    }
}

data class UserId(val value: String)