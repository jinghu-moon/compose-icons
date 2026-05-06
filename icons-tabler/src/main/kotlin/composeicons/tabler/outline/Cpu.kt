package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cpu: ImageVector
    get() {
        if (_cpu != null) return _cpu!!
        _cpu = tablerOutlineIcon(
            name = "Cpu",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 6C5 5.448 5.448 5 6 5h12c.552 0 1 .448 1 1v12c0 .552-.448 1-1 1h-12C5.448 19 5 18.552 5 18v-12")
            addPathData("M9 9h6v6h-6v-6")
            addPathData("M3 10h2")
            addPathData("M3 14h2")
            addPathData("M10 3v2")
            addPathData("M14 3v2")
            addPathData("M21 10h-2")
            addPathData("M21 14h-2")
            addPathData("M14 21v-2")
            addPathData("M10 21v-2")
        }
        return _cpu!!
    }

private var _cpu: ImageVector? = null
