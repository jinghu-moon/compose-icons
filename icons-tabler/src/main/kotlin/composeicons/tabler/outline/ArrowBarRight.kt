package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBarRight: ImageVector
    get() {
        if (_arrowBarRight != null) return _arrowBarRight!!
        _arrowBarRight = tablerOutlineIcon(
            name = "ArrowBarRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 12h-10")
            addPathData("M20 12l-4 4")
            addPathData("M20 12 16 8")
            addPathData("M4 4v16")
        }
        return _arrowBarRight!!
    }

private var _arrowBarRight: ImageVector? = null
