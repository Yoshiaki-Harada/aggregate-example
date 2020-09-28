package limit


interface UserRepository {
    fun findBy(userId : UserId) : User?
}