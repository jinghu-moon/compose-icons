package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartPpf: ImageVector
    get() {
        if (_chartPpf != null) return _chartPpf!!
        _chartPpf = tablerOutlineIcon(
            name = "ChartPpf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 17C19 10.925 13.627 6 7 6")
            addPathData("M3 3v18h18")
        }
        return _chartPpf!!
    }

private var _chartPpf: ImageVector? = null
