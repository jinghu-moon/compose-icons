package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChevronsDownLeft: ImageVector
    get() {
        if (_chevronsDownLeft != null) return _chevronsDownLeft!!
        _chevronsDownLeft = tablerOutlineIcon(
            name = "ChevronsDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 5v8h8")
            addPathData("M7 9v8h8")
        }
        return _chevronsDownLeft!!
    }

private var _chevronsDownLeft: ImageVector? = null
