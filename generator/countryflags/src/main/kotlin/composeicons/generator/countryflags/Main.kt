package composeicons.generator.countryflags

import composeicons.generator.core.generatorMain

fun main(args: Array<String>) = generatorMain(args) { CountryFlagsIconSource(referRoot = it) }
