package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Book2: ImageVector
    get() {
        if (_book2 != null) return _book2!!
        _book2 = tablerOutlineIcon(
            name = "Book2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 4v16h-12C5.895 20 5 19.105 5 18v-12C5 4.895 5.895 4 7 4h12")
            addPathData("M19 16h-12c-1.105 0-2 .895-2 2")
            addPathData("M9 8h6")
        }
        return _book2!!
    }

private var _book2: ImageVector? = null
