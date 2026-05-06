package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Crane: ImageVector
    get() {
        if (_crane != null) return _crane!!
        _crane = tablerOutlineIcon(
            name = "Crane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 21h6")
            addPathData("M9 21v-18L3 9h18")
            addPathData("M9 3 19 9")
            addPathData("M17 9v4c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2-1.105 0-2-.895-2-2")
        }
        return _crane!!
    }

private var _crane: ImageVector? = null
