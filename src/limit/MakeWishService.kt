package limit

class MakeWishService(private val wishRepository: WishRepository, private val userRepository: UserRepository) {
    fun execute(request: MakeWishRequest) {
        val user = userRepository.findBy(UserId(request.userId)) ?: throw UserNotFoundException()
        val count = wishRepository.numberOfWishesBy(user.userId)
        if (count > 3) {
            throw MaxNumberOfWishesExceededException()
        }
        val wish = user.makeWish(Content(request.content))
        wishRepository.save(wish)
    }
}