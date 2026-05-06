package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FireHydrantOff: ImageVector
    get() {
        if (_fireHydrantOff != null) return _fireHydrantOff!!
        _fireHydrantOff = tablerOutlineIcon(
            name = "FireHydrantOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 21h14")
            addPathData("M17 21v-4M19 15v-2c0-.552-.448-1-1-1h-1v-4C17 5.978 15.783 4.156 13.915 3.381 12.048 2.607 9.898 3.034 8.467 4.462M7.08 7.1C7.026 7.397 7 7.698 7 8v4h-1c-.552 0-1 .448-1 1v2c0 .552 .448 1 1 1h1v5")
            addPathData("M12 12c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M6 8h2M12 8h6")
            addPathData("M3 3 21 21")
        }
        return _fireHydrantOff!!
    }

private var _fireHydrantOff: ImageVector? = null
