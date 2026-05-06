package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Gymnastics: ImageVector
    get() {
        if (_gymnastics != null) return _gymnastics!!
        _gymnastics = tablerOutlineIcon(
            name = "Gymnastics",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 7c0 .552 .448 1 1 1C8.552 8 9 7.552 9 7 9 6.448 8.552 6 8 6 7.448 6 7 6.448 7 7")
            addPathData("M13 21l1-9L21 6")
            addPathData("M3 11h6l5 1")
            addPathData("M11.5 8.5 16 5")
        }
        return _gymnastics!!
    }

private var _gymnastics: ImageVector? = null
