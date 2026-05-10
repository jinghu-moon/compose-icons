package composeicons.generator.iconoir

import composeicons.generator.core.generatorMain

fun main(args: Array<String>) = generatorMain(args) { IconoirIconSource(referRoot = it) }
