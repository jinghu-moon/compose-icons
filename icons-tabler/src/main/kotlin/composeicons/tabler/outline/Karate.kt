package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Karate: ImageVector
    get() {
        if (_karate != null) return _karate!!
        _karate = tablerOutlineIcon(
            name = "Karate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 4c0 .552 .448 1 1 1 .552 0 1-.448 1-1C19 3.448 18.552 3 18 3c-.552 0-1 .448-1 1")
            addPathData("M3 9l4.5 1 3 2.5")
            addPathData("M13 21v-8L16 7.5")
            addPathData("M8 4.5l4 2 4 1L20 11l-2 3.5")
        }
        return _karate!!
    }

private var _karate: ImageVector? = null
