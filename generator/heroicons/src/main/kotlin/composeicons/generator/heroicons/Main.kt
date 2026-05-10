package composeicons.generator.heroicons

import composeicons.generator.core.generatorMain

fun main(args: Array<String>) = generatorMain(args) { HeroiconsIconSource(referRoot = it) }
