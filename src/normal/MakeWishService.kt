package normal

class MakeWishService(private val wishRepository: WishRepository, private val userRepository: UserRepository) {
    fun execute(request: MakeWishRequest) {
        val user = userRepository.findBy(UserId(request.userId)) ?: throw UserNotFoundException()
        val wish = Wish(
            user.userId,
            Content(request.content)
        )
        wishRepository.save(wish)
    }
}