package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowDownRight: ImageVector
    get() {
        if (_arrowDownRight != null) return _arrowDownRight!!
        _arrowDownRight = tablerOutlineIcon(
            name = "ArrowDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 7 17 17")
            addPathData("M17 8v9h-9")
        }
        return _arrowDownRight!!
    }

private var _arrowDownRight: ImageVector? = null
