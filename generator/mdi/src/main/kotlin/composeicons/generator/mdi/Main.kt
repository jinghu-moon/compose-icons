package composeicons.generator.mdi

import composeicons.generator.core.generatorMain

fun main(args: Array<String>) = generatorMain(args) { MdiIconSource(referRoot = it) }
