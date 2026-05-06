package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBarBoth: ImageVector
    get() {
        if (_arrowBarBoth != null) return _arrowBarBoth!!
        _arrowBarBoth = tablerOutlineIcon(
            name = "ArrowBarBoth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 12h-6")
            addPathData("M5 15 2 12 5 9")
            addPathData("M22 12h-6")
            addPathData("M19 15l3-3L19 9")
            addPathData("M12 4v16")
        }
        return _arrowBarBoth!!
    }

private var _arrowBarBoth: ImageVector? = null
