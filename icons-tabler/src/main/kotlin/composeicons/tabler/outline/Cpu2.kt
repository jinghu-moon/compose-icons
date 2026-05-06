package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cpu2: ImageVector
    get() {
        if (_cpu2 != null) return _cpu2!!
        _cpu2 = tablerOutlineIcon(
            name = "Cpu2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 6C5 5.448 5.448 5 6 5h12c.552 0 1 .448 1 1v12c0 .552-.448 1-1 1h-12C5.448 19 5 18.552 5 18v-12")
            addPathData("M8 10v-2h2M16 14v2h-2M10 16h-2v-2M16 10v-2h-2")
            addPathData("M3 10h2")
            addPathData("M3 14h2")
            addPathData("M10 3v2")
            addPathData("M14 3v2")
            addPathData("M21 10h-2")
            addPathData("M21 14h-2")
            addPathData("M14 21v-2")
            addPathData("M10 21v-2")
        }
        return _cpu2!!
    }

private var _cpu2: ImageVector? = null
