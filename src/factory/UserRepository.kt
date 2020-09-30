package factory


interface UserRepository {
    fun findBy(userId : UserId) : User?
}