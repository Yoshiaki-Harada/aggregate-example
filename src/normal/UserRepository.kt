package normal


interface UserRepository {
    fun findBy(userId: UserId): User?
}