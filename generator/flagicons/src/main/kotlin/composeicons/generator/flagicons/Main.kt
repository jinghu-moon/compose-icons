package composeicons.generator.flagicons

import composeicons.generator.core.generatorMain

fun main(args: Array<String>) = generatorMain(args) { FlagIconsIconSource(referRoot = it) }
