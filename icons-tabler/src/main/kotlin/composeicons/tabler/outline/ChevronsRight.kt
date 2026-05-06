package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChevronsRight: ImageVector
    get() {
        if (_chevronsRight != null) return _chevronsRight!!
        _chevronsRight = tablerOutlineIcon(
            name = "ChevronsRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 7l5 5L7 17")
            addPathData("M13 7l5 5-5 5")
        }
        return _chevronsRight!!
    }

private var _chevronsRight: ImageVector? = null
