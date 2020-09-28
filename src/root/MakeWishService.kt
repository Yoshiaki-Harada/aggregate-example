package root

class MakeWishService(private val wishRepository: WishRepository, private val userRepository: UserRepository) {
    fun execute(request: MakeWishRequest) {
        val user = userRepository.findBy(UserId(request.userId)) ?: throw UserNotFoundException()

        wishRepository.save(
            Wish(
                user.userId,
                Content(request.content)
            )
        )
    }
}