package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowLoopLeft: ImageVector
    get() {
        if (_arrowLoopLeft != null) return _arrowLoopLeft!!
        _arrowLoopLeft = tablerOutlineIcon(
            name = "ArrowLoopLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 21v-13C13 5.791 14.791 4 17 4c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-13")
            addPathData("M8 16 4 12 8 8")
        }
        return _arrowLoopLeft!!
    }

private var _arrowLoopLeft: ImageVector? = null
