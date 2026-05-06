package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BarbellOff: ImageVector
    get() {
        if (_barbellOff != null) return _barbellOff!!
        _barbellOff = tablerOutlineIcon(
            name = "BarbellOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 12h1")
            addPathData("M6 8h-2C3.448 8 3 8.448 3 9v6c0 .552 .448 1 1 1h2")
            addPathData("M6.298 6.288C6.107 6.476 6 6.732 6 7v10c0 .552 .448 1 1 1h1c.552 0 1-.448 1-1v-8")
            addPathData("M9 12h3")
            addPathData("M15 15v2c0 .552 .448 1 1 1h1c.275 0 .523-.11 .704-.29M18 14v-7C18 6.448 17.552 6 17 6h-1c-.552 0-1 .448-1 1v4")
            addPathData("M18 8h2c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1")
            addPathData("M22 12h-1")
            addPathData("M3 3 21 21")
        }
        return _barbellOff!!
    }

private var _barbellOff: ImageVector? = null
