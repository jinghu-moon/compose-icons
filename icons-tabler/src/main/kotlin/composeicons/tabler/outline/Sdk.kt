package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sdk: ImageVector
    get() {
        if (_sdk != null) return _sdk!!
        _sdk = tablerOutlineIcon(
            name = "Sdk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 8h-3C3.448 8 3 8.448 3 9v2c0 .552 .448 1 1 1h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-3")
            addPathData("M17 8v8")
            addPathData("M21 8l-3 4 3 4")
            addPathData("M17 12h1")
            addPathData("M10 8v8h2c1.105 0 2-.895 2-2v-4C14 8.895 13.105 8 12 8h-2")
        }
        return _sdk!!
    }

private var _sdk: ImageVector? = null
