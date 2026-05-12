package composeicons.generator.octicons

import composeicons.generator.core.generatorMain

fun main(args: Array<String>) = generatorMain(args) { OcticonsSource(referRoot = it) }
