package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ColumnInsertRight: ImageVector
    get() {
        if (_columnInsertRight != null) return _columnInsertRight!!
        _columnInsertRight = tablerOutlineIcon(
            name = "ColumnInsertRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 4h4c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-4C5.448 20 5 19.552 5 19v-14C5 4.448 5.448 4 6 4")
            addPathData("M15 12h4")
            addPathData("M17 10v4")
        }
        return _columnInsertRight!!
    }

private var _columnInsertRight: ImageVector? = null
