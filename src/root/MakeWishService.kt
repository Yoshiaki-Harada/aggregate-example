package root

class MakeWishService(private val userRepository: UserRepository) {
    fun execute(request: MakeWishRequest) {
        val user = userRepository.findBy(UserId(request.userId)) ?: throw UserNotFoundException()
        val wish = user.makeWish(Content(request.content))
        userRepository.save(wish)
    }
}