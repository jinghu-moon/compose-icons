package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Book: ImageVector
    get() {
        if (_book != null) return _book!!
        _book = tablerOutlineIcon(
            name = "Book",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 19c2.785-1.608 6.215-1.608 9 0 2.785-1.608 6.215-1.608 9 0")
            addPathData("M3 6C5.785 4.392 9.215 4.392 12 6c2.785-1.608 6.215-1.608 9 0")
            addPathData("M3 6v13")
            addPathData("M12 6v13")
            addPathData("M21 6v13")
        }
        return _book!!
    }

private var _book: ImageVector? = null
