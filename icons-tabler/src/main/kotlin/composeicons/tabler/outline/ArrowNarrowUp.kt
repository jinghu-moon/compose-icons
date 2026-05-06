package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowNarrowUp: ImageVector
    get() {
        if (_arrowNarrowUp != null) return _arrowNarrowUp!!
        _arrowNarrowUp = tablerOutlineIcon(
            name = "ArrowNarrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 5v14")
            addPathData("M16 9 12 5")
            addPathData("M8 9 12 5")
        }
        return _arrowNarrowUp!!
    }

private var _arrowNarrowUp: ImageVector? = null
