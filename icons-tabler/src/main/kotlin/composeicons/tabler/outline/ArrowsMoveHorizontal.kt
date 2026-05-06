package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsMoveHorizontal: ImageVector
    get() {
        if (_arrowsMoveHorizontal != null) return _arrowsMoveHorizontal!!
        _arrowsMoveHorizontal = tablerOutlineIcon(
            name = "ArrowsMoveHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 9l3 3-3 3")
            addPathData("M15 12h6")
            addPathData("M6 9 3 12l3 3")
            addPathData("M3 12h6")
        }
        return _arrowsMoveHorizontal!!
    }

private var _arrowsMoveHorizontal: ImageVector? = null
