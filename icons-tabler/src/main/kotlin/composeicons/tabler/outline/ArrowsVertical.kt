package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsVertical: ImageVector
    get() {
        if (_arrowsVertical != null) return _arrowsVertical!!
        _arrowsVertical = tablerOutlineIcon(
            name = "ArrowsVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 7 12 3l4 4")
            addPathData("M8 17l4 4 4-4")
            addPathData("M12 3v18")
        }
        return _arrowsVertical!!
    }

private var _arrowsVertical: ImageVector? = null
