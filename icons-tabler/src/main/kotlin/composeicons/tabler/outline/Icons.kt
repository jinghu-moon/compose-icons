package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Icons: ImageVector
    get() {
        if (_icons != null) return _icons!!
        _icons = tablerOutlineIcon(
            name = "Icons",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 6.5C3 8.433 4.567 10 6.5 10 8.433 10 10 8.433 10 6.5 10 4.567 8.433 3 6.5 3 4.567 3 3 4.567 3 6.5")
            addPathData("M2.5 21h8l-4-7-4 7")
            addPathData("M14 3l7 7")
            addPathData("M14 10 21 3")
            addPathData("M14 14h7v7h-7v-7")
        }
        return _icons!!
    }

private var _icons: ImageVector? = null
