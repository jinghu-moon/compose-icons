package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ToggleLeft: ImageVector
    get() {
        if (_toggleLeft != null) return _toggleLeft!!
        _toggleLeft = tablerOutlineIcon(
            name = "ToggleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C10 10.895 9.105 10 8 10c-1.105 0-2 .895-2 2")
            addPathData("M2 12C2 8.686 4.686 6 8 6h8c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-8C4.686 18 2 15.314 2 12")
        }
        return _toggleLeft!!
    }

private var _toggleLeft: ImageVector? = null
