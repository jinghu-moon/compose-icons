package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Json: ImageVector
    get() {
        if (_json != null) return _json!!
        _json = tablerOutlineIcon(
            name = "Json",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 16v-8l3 8v-8")
            addPathData("M15 8c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2v-4c0-1.105 .895-2 2-2")
            addPathData("M1 8h3v6.5C4 15.328 3.328 16 2.5 16 1.672 16 1 15.328 1 14.5v-.5")
            addPathData("M7 15c0 .552 .448 1 1 1h1c.552 0 1-.448 1-1v-2c0-.552-.448-1-1-1h-1C7.448 12 7 11.552 7 11v-2C7 8.448 7.448 8 8 8h1c.552 0 1 .448 1 1")
        }
        return _json!!
    }

private var _json: ImageVector? = null
