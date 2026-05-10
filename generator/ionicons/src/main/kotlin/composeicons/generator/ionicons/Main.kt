package composeicons.generator.ionicons

import composeicons.generator.core.generatorMain

fun main(args: Array<String>) = generatorMain(args) { IoniconsIconSource(referRoot = it) }
