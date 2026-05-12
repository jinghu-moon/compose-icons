package composeicons.generator.simpleicons

import composeicons.generator.core.generatorMain

fun main(args: Array<String>) = generatorMain(args) { SimpleIconsSource(referRoot = it) }
