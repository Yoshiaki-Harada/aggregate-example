package limit

interface WishRepository {
    fun save(wish: Wish)
    fun numberOfWishesBy(userId: UserId): Int
}