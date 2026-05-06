package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Windsock: ImageVector
    get() {
        if (_windsock != null) return _windsock!!
        _windsock = tablerOutlineIcon(
            name = "Windsock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 3v18")
            addPathData("M6 11 18 10v-4L6 5")
            addPathData("M10 5.5v5")
            addPathData("M14 6v4")
            addPathData("M4 21h4")
        }
        return _windsock!!
    }

private var _windsock: ImageVector? = null
