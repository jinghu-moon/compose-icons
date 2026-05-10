package composeicons.generator.radix

import composeicons.generator.core.generatorMain

fun main(args: Array<String>) = generatorMain(args) { RadixIconSource(referRoot = it) }
