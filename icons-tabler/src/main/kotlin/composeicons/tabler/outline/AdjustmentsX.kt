package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AdjustmentsX: ImageVector
    get() {
        if (_adjustmentsX != null) return _adjustmentsX!!
        _adjustmentsX = tablerOutlineIcon(
            name = "AdjustmentsX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 10c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 8.895 7.105 8 6 8 4.895 8 4 8.895 4 10")
            addPathData("M6 4v4")
            addPathData("M6 12v8")
            addPathData("M13.653 14.874c-.617-.905-1.847-1.146-2.759-.54-.912 .606-1.168 1.833-.572 2.753 .595 .92 1.819 1.189 2.746 .605")
            addPathData("M12 4v10")
            addPathData("M12 18v2")
            addPathData("M16 7c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C20 5.895 19.105 5 18 5c-1.105 0-2 .895-2 2")
            addPathData("M18 4v1")
            addPathData("M18 9v4")
            addPathData("M22 22 17 17")
            addPathData("M17 22l5-5")
        }
        return _adjustmentsX!!
    }

private var _adjustmentsX: ImageVector? = null
