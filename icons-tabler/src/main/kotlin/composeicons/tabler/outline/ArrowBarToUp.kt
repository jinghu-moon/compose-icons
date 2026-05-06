package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBarToUp: ImageVector
    get() {
        if (_arrowBarToUp != null) return _arrowBarToUp!!
        _arrowBarToUp = tablerOutlineIcon(
            name = "ArrowBarToUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 10v10")
            addPathData("M12 10l4 4")
            addPathData("M12 10 8 14")
            addPathData("M4 4h16")
        }
        return _arrowBarToUp!!
    }

private var _arrowBarToUp: ImageVector? = null
