package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.StatusChange: ImageVector
    get() {
        if (_statusChange != null) return _statusChange!!
        _statusChange = tablerOutlineIcon(
            name = "StatusChange",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 16.895 7.105 16 6 16c-1.105 0-2 .895-2 2")
            addPathData("M16 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M6 12v-2C6 6.686 8.686 4 12 4c3.314 0 6 2.686 6 6v2")
            addPathData("M15 9l3 3L21 9")
        }
        return _statusChange!!
    }

private var _statusChange: ImageVector? = null
