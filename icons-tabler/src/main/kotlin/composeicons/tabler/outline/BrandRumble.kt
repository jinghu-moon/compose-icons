package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandRumble: ImageVector
    get() {
        if (_brandRumble != null) return _brandRumble!!
        _brandRumble = tablerOutlineIcon(
            name = "BrandRumble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.993 9.108c.383 .4 .687 .863 .893 1.368 .415 1.014 .418 2.15 .006 3.166-.207 .509-.508 .974-.887 1.372-.686 .72-1.424 1.388-2.208 2-.79 .616-1.624 1.174-2.495 1.669-1.76 .997-3.653 1.738-5.622 2.202-1.016 .242-2.086 .098-3.002-.404-.446-.245-.841-.573-1.163-.967-.316-.387-.552-.833-.695-1.312C3.621 14.3 3.798 9.89 4.954 5.972 5.563 3.915 7.597 2.623 9.691 3.098c3.88 .88 7.52 3.147 10.302 6.01")
            addPathData("M14.044 13.034c.67-.505 .67-1.489 0-2.01-.477-.378-.978-.727-1.498-1.044-.523-.32-1.064-.608-1.62-.865-.77-.35-1.63 .139-1.753 .973-.189 1.253-.223 2.525-.1 3.786 .034 .395 .255 .749 .595 .953 .34 .203 .757 .231 1.12 .074 .582-.239 1.148-.516 1.694-.827 .542-.311 1.064-.657 1.562-1.035v-.005")
        }
        return _brandRumble!!
    }

private var _brandRumble: ImageVector? = null
