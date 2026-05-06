package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowUp: ImageVector
    get() {
        if (_arrowUp != null) return _arrowUp!!
        _arrowUp = tablerOutlineIcon(
            name = "ArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 5v14")
            addPathData("M18 11 12 5")
            addPathData("M6 11 12 5")
        }
        return _arrowUp!!
    }

private var _arrowUp: ImageVector? = null
