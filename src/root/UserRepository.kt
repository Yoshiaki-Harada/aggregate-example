package root

import normal.User
import normal.UserId

interface UserRepository {
    fun findBy(userId : UserId) : User?
}