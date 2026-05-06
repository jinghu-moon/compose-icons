package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BathOff: ImageVector
    get() {
        if (_bathOff != null) return _bathOff!!
        _bathOff = tablerOutlineIcon(
            name = "BathOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 12h4c.552 0 1 .448 1 1v3c0 .311-.036 .614-.103 .904M19.287 19.282c-.67 .469-1.469 .719-2.287 .718h-10C4.791 20 3 18.209 3 16v-3c0-.552 .448-1 1-1h8")
            addPathData("M6 12v-6M7.178 3.176C7.43 3.063 7.708 3 8 3h3v2.25")
            addPathData("M4 21 5 19.5")
            addPathData("M20 21 19 19.5")
            addPathData("M3 3 21 21")
        }
        return _bathOff!!
    }

private var _bathOff: ImageVector? = null
