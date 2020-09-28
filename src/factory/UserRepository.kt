package factory


interface UserRepository {
    fun findBy(userId : UserId) : User?
    fun save(wish: Wish)
}