package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChevronsDownRight: ImageVector
    get() {
        if (_chevronsDownRight != null) return _chevronsDownRight!!
        _chevronsDownRight = tablerOutlineIcon(
            name = "ChevronsDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 5v8h-8")
            addPathData("M17 9v8h-8")
        }
        return _chevronsDownRight!!
    }

private var _chevronsDownRight: ImageVector? = null
