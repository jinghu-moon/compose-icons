package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlertSquareRounded: ImageVector
    get() {
        if (_alertSquareRounded != null) return _alertSquareRounded!!
        _alertSquareRounded = tablerOutlineIcon(
            name = "AlertSquareRounded",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3c7.2 0 9 1.8 9 9 0 7.2-1.8 9-9 9C4.8 21 3 19.2 3 12 3 4.8 4.8 3 12 3")
            addPathData("M12 8v4")
            addPathData("M12 16h.01")
        }
        return _alertSquareRounded!!
    }

private var _alertSquareRounded: ImageVector? = null
