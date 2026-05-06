package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AdjustmentsPause: ImageVector
    get() {
        if (_adjustmentsPause != null) return _adjustmentsPause!!
        _adjustmentsPause = tablerOutlineIcon(
            name = "AdjustmentsPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 10c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 8.895 7.105 8 6 8 4.895 8 4 8.895 4 10")
            addPathData("M6 4v4")
            addPathData("M6 12v8")
            addPathData("M13.627 14.836c-.629-.879-1.841-1.099-2.739-.498-.898 .601-1.156 1.806-.584 2.722 .573 .916 1.769 1.212 2.703 .668")
            addPathData("M12 4v10")
            addPathData("M12 18v2")
            addPathData("M16 7c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C20 5.895 19.105 5 18 5c-1.105 0-2 .895-2 2")
            addPathData("M18 4v1")
            addPathData("M17 17v5")
            addPathData("M21 17v5")
            addPathData("M18 9v4.5")
        }
        return _adjustmentsPause!!
    }

private var _adjustmentsPause: ImageVector? = null
