package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TableColumn: ImageVector
    get() {
        if (_tableColumn != null) return _tableColumn!!
        _tableColumn = tablerOutlineIcon(
            name = "TableColumn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14")
            addPathData("M10 10h11")
            addPathData("M10 3v18")
            addPathData("M9 3 3 9")
            addPathData("M10 7 3 14")
            addPathData("M10 12 3 19")
            addPathData("M10 17 6 21")
        }
        return _tableColumn!!
    }

private var _tableColumn: ImageVector? = null
