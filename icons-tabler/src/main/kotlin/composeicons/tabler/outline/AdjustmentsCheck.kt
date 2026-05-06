package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AdjustmentsCheck: ImageVector
    get() {
        if (_adjustmentsCheck != null) return _adjustmentsCheck!!
        _adjustmentsCheck = tablerOutlineIcon(
            name = "AdjustmentsCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 10c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 8.895 7.105 8 6 8 4.895 8 4 8.895 4 10")
            addPathData("M6 4v4")
            addPathData("M6 12v8")
            addPathData("M13.823 15.176c-.367-.811-1.226-1.282-2.108-1.154-.881 .127-1.572 .822-1.695 1.703-.123 .882 .352 1.739 1.165 2.102")
            addPathData("M12 4v10")
            addPathData("M16 7c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C20 5.895 19.105 5 18 5c-1.105 0-2 .895-2 2")
            addPathData("M18 4v1")
            addPathData("M18 9v5")
            addPathData("M15 19l2 2 4-4")
        }
        return _adjustmentsCheck!!
    }

private var _adjustmentsCheck: ImageVector? = null
