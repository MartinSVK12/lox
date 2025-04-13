package sunsetsatellite.lang.sunlite

enum class ClassModifier {
    NORMAL,
    DYNAMIC;

    companion object {
        fun get(token: Token?): ClassModifier {
            return when (token?.type) {
                TokenType.DYNAMIC -> DYNAMIC
                else -> NORMAL
            }
        }
    }
}