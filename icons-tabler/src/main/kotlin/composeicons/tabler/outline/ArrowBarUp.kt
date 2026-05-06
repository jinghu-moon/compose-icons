package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBarUp: ImageVector
    get() {
        if (_arrowBarUp != null) return _arrowBarUp!!
        _arrowBarUp = tablerOutlineIcon(
            name = "ArrowBarUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 4v10")
            addPathData("M12 4l4 4")
            addPathData("M12 4 8 8")
            addPathData("M4 20h16")
        }
        return _arrowBarUp!!
    }

private var _arrowBarUp: ImageVector? = null
