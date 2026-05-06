package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RowInsertTop: ImageVector
    get() {
        if (_rowInsertTop != null) return _rowInsertTop!!
        _rowInsertTop = tablerOutlineIcon(
            name = "RowInsertTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 18v-4c0-.552 .448-1 1-1h14c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-14C4.448 19 4 18.552 4 18")
            addPathData("M12 9v-4")
            addPathData("M10 7h4")
        }
        return _rowInsertTop!!
    }

private var _rowInsertTop: ImageVector? = null
