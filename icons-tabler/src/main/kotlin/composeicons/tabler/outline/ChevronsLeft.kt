package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChevronsLeft: ImageVector
    get() {
        if (_chevronsLeft != null) return _chevronsLeft!!
        _chevronsLeft = tablerOutlineIcon(
            name = "ChevronsLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 7 6 12l5 5")
            addPathData("M17 7l-5 5 5 5")
        }
        return _chevronsLeft!!
    }

private var _chevronsLeft: ImageVector? = null
