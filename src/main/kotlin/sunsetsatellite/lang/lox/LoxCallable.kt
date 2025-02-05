package sunsetsatellite.lang.lox

interface LoxCallable {
	fun call(interpreter: Interpreter, arguments: List<Any?>?): Any?
	fun arity(): Int
	fun signature(): String
}