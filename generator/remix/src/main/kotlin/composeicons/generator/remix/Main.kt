package composeicons.generator.remix

import composeicons.generator.core.generatorMain

fun main(args: Array<String>) = generatorMain(args) { RemixIconSource(referRoot = it) }
