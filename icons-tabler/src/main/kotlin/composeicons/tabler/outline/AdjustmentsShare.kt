package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AdjustmentsShare: ImageVector
    get() {
        if (_adjustmentsShare != null) return _adjustmentsShare!!
        _adjustmentsShare = tablerOutlineIcon(
            name = "AdjustmentsShare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 10c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 8.895 7.105 8 6 8 4.895 8 4 8.895 4 10")
            addPathData("M6 4v4")
            addPathData("M6 12v8")
            addPathData("M13.387 14.56c-.703-.676-1.79-.747-2.575-.168-.785 .579-1.037 1.64-.598 2.51 .439 .871 1.443 1.297 2.375 1.01")
            addPathData("M12 4v10")
            addPathData("M12 18v2")
            addPathData("M16 7c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C20 5.895 19.105 5 18 5c-1.105 0-2 .895-2 2")
            addPathData("M18 4v1")
            addPathData("M16 22l5-5")
            addPathData("M21 21.5v-4.5h-4.5")
            addPathData("M18 9v4")
        }
        return _adjustmentsShare!!
    }

private var _adjustmentsShare: ImageVector? = null
