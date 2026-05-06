package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ruler2: ImageVector
    get() {
        if (_ruler2 != null) return _ruler2!!
        _ruler2 = tablerOutlineIcon(
            name = "Ruler2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 3l4 4L7 21 3 17 17 3")
            addPathData("M16 7 14.5 5.5")
            addPathData("M13 10 11.5 8.5")
            addPathData("M10 13 8.5 11.5")
            addPathData("M7 16 5.5 14.5")
        }
        return _ruler2!!
    }

private var _ruler2: ImageVector? = null
