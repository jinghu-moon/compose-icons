package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HierarchyOff: ImageVector
    get() {
        if (_hierarchyOff != null) return _hierarchyOff!!
        _hierarchyOff = tablerOutlineIcon(
            name = "HierarchyOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 5c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C14 3.895 13.105 3 12 3c-1.105 0-2 .895-2 2")
            addPathData("M3 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C7 17.895 6.105 17 5 17c-1.105 0-2 .895-2 2")
            addPathData("M17.585 17.587c-.763 .781-.759 2.029 .008 2.805 .768 .776 2.016 .793 2.805 .038")
            addPathData("M6.5 17.5 12 13l5.5 4.5")
            addPathData("M12 7v1M12 12v1")
            addPathData("M3 3 21 21")
        }
        return _hierarchyOff!!
    }

private var _hierarchyOff: ImageVector? = null
