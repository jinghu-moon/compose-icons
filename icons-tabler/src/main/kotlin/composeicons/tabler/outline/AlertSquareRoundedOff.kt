package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlertSquareRoundedOff: ImageVector
    get() {
        if (_alertSquareRoundedOff != null) return _alertSquareRoundedOff!!
        _alertSquareRoundedOff = tablerOutlineIcon(
            name = "AlertSquareRoundedOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.201 19.199C17.851 20.549 15.601 21 12 21 4.8 21 3 19.2 3 12 3 8.402 3.45 6.153 4.797 4.803M7.423 3.427C8.627 3.12 10.132 3 12 3c7.2 0 9 1.8 9 9 0 1.865-.12 3.367-.425 4.57")
            addPathData("M12 7v1")
            addPathData("M12 16h.01")
            addPathData("M3 3 21 21")
        }
        return _alertSquareRoundedOff!!
    }

private var _alertSquareRoundedOff: ImageVector? = null
