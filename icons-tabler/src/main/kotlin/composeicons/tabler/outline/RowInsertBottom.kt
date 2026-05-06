package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RowInsertBottom: ImageVector
    get() {
        if (_rowInsertBottom != null) return _rowInsertBottom!!
        _rowInsertBottom = tablerOutlineIcon(
            name = "RowInsertBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 6v4c0 .552-.448 1-1 1h-14C4.448 11 4 10.552 4 10v-4C4 5.448 4.448 5 5 5h14c.552 0 1 .448 1 1")
            addPathData("M12 15v4")
            addPathData("M14 17h-4")
        }
        return _rowInsertBottom!!
    }

private var _rowInsertBottom: ImageVector? = null
