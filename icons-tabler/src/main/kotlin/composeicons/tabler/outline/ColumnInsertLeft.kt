package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ColumnInsertLeft: ImageVector
    get() {
        if (_columnInsertLeft != null) return _columnInsertLeft!!
        _columnInsertLeft = tablerOutlineIcon(
            name = "ColumnInsertLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 4h4c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-4c-.552 0-1-.448-1-1v-14c0-.552 .448-1 1-1")
            addPathData("M5 12h4")
            addPathData("M7 10v4")
        }
        return _columnInsertLeft!!
    }

private var _columnInsertLeft: ImageVector? = null
