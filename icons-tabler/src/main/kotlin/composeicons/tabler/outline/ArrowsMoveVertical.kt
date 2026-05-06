package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsMoveVertical: ImageVector
    get() {
        if (_arrowsMoveVertical != null) return _arrowsMoveVertical!!
        _arrowsMoveVertical = tablerOutlineIcon(
            name = "ArrowsMoveVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 18l3 3 3-3")
            addPathData("M12 15v6")
            addPathData("M15 6 12 3 9 6")
            addPathData("M12 3v6")
        }
        return _arrowsMoveVertical!!
    }

private var _arrowsMoveVertical: ImageVector? = null
