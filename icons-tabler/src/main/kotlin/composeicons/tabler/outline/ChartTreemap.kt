package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartTreemap: ImageVector
    get() {
        if (_chartTreemap != null) return _chartTreemap!!
        _chartTreemap = tablerOutlineIcon(
            name = "ChartTreemap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6C4 4.895 4.895 4 6 4h12c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-12C4.895 20 4 19.105 4 18v-12")
            addPathData("M12 4v16")
            addPathData("M4 15h8")
            addPathData("M12 12h8")
            addPathData("M16 12v8")
            addPathData("M16 16h4")
        }
        return _chartTreemap!!
    }

private var _chartTreemap: ImageVector? = null
