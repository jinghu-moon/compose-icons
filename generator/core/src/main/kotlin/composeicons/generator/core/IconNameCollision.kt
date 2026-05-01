package composeicons.generator.core

data class IconNameCollision(
    val kotlinName: String,
    val entries: List<SvgIconEntry>,
)

