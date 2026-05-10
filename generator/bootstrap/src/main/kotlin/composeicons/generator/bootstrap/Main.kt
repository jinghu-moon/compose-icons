package composeicons.generator.bootstrap

import composeicons.generator.core.generatorMain

fun main(args: Array<String>) = generatorMain(args) { BootstrapIconSource(referRoot = it) }
