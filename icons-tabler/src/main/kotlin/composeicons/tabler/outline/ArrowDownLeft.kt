package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowDownLeft: ImageVector
    get() {
        if (_arrowDownLeft != null) return _arrowDownLeft!!
        _arrowDownLeft = tablerOutlineIcon(
            name = "ArrowDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 7 7 17")
            addPathData("M16 17h-9v-9")
        }
        return _arrowDownLeft!!
    }

private var _arrowDownLeft: ImageVector? = null
