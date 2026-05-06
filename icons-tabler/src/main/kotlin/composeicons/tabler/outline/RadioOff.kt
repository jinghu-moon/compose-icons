package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RadioOff: ImageVector
    get() {
        if (_radioOff != null) return _radioOff!!
        _radioOff = tablerOutlineIcon(
            name = "RadioOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3 9.014 5 6.139 6.15 4.629 6.754C4.249 6.906 4 7.273 4 7.682v11.323c0 .552 .448 1 1 1h14c.266-0 .52-.106 .708-.294M20 16.005v-8c0-.552-.448-1-1-1h-8M7 7.005h-2.5")
            addPathData("M4 12h8M16 12h4")
            addPathData("M7 12v-2")
            addPathData("M13 16v.01")
            addPathData("M3 3 21 21")
        }
        return _radioOff!!
    }

private var _radioOff: ImageVector? = null
