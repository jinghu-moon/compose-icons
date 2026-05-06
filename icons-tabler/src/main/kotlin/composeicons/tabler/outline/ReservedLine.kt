package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ReservedLine: ImageVector
    get() {
        if (_reservedLine != null) return _reservedLine!!
        _reservedLine = tablerOutlineIcon(
            name = "ReservedLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 20h6")
            addPathData("M12 14v6")
            addPathData("M4 6C4 4.895 4.895 4 6 4h12c1.105 0 2 .895 2 2v6c0 1.105-.895 2-2 2h-12C4.895 14 4 13.105 4 12v-6")
            addPathData("M9 9h6")
        }
        return _reservedLine!!
    }

private var _reservedLine: ImageVector? = null
