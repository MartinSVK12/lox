package sunsetsatellite.vm.lox

class LoxFunction(val name: String, val chunk: Chunk, val arity: Int = 0) {

	override fun toString(): String {
		return "<fn '${name}'>"
	}
}