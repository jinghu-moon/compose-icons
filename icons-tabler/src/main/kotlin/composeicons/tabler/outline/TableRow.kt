package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TableRow: ImageVector
    get() {
        if (_tableRow != null) return _tableRow!!
        _tableRow = tablerOutlineIcon(
            name = "TableRow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14")
            addPathData("M9 3 3 9")
            addPathData("M14 3 7 10")
            addPathData("M19 3l-7 7")
            addPathData("M21 6l-4 4")
            addPathData("M3 10h18")
            addPathData("M10 10v11")
        }
        return _tableRow!!
    }

private var _tableRow: ImageVector? = null
