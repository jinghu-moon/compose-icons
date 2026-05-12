package composeicons.generator.carbon

import composeicons.generator.core.generatorMain

fun main(args: Array<String>) = generatorMain(args) { CarbonSource(referRoot = it) }
